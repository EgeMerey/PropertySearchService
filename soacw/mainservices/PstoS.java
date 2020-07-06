package com.inm381.app.soacw.mainservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inm381.app.soacw.domain.Property;
import com.inm381.app.soacw.domain.Uroperty;
import com.inm381.app.soacw.services.*;



@Service
public class PstoS extends UropertyService {
	@Autowired
	private UropertyService userv;
	@Autowired
	private PropertyService pser;
	@Transactional
	public List <Property> getPropertiesById (List <Uroperty> uroperty){
		Integer i = uroperty.size();
		
		List <Property> prlist = new ArrayList <>();
		for(int x = 0;x<i;x++) {
			prlist.add(pser.getById(uroperty.get(x).getId()));
		}
		
		return prlist;
	}	

	public void saveSearches(long userId, List <Property> proplist) {
		
		int proplistsize = proplist.size();

		List <Uroperty> uroperty = new ArrayList<>();
	// delete existing items from uroprety that has same id
		deleteUropList(userId);
	// create a new uroprety list 
		for(int x = 0;x<proplistsize;x++) {
			// iterate the list and populate the uroprety list
			uroperty.add(new Uroperty(userId, proplist.get(x).getId()));
			saveUropList(uroperty);
		}
		
	// take a list save everything in that list to the database
		
		
	}
	
	public void saveUropList (List <Uroperty> uropList) {
		
		int lenght = uropList.size();
		for(int x = 0;x<lenght;x++) {
			userv.saveUroperty(uropList.get(x));
		}
	
	}
	
	public void deleteUropList (long userId) {
	
		if (getBunchOfUroperty(userId).size() != 0) {
			for (Uroperty u : getBunchOfUroperty(userId)) {
				deleteUropertybyUserId(u.getUserId());
			}
		}
			
	}
	
}
