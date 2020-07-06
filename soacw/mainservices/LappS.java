package com.inm381.app.soacw.mainservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inm381.app.soacw.domain.Loan;

import com.inm381.app.soacw.domain.Usan;

import com.inm381.app.soacw.services.LoanApplicationService;
import com.inm381.app.soacw.services.LoanService;
import com.inm381.app.soacw.services.UsanService;


@Service
public class LappS extends LoanApplicationService {
	
	@Autowired
	private UsanService usanserv;
	@Autowired
	private LoanService lser;
	@Transactional
	public List <Loan> getloansbyId(List <Usan> usan){
		Integer i = usan.size();
		
		List <Loan> prlist = new ArrayList <>();
		for(int x = 0;x<i;x++) {
			prlist.add(lser.getLoan(usan.get(x).getId()));
		}
		
		return prlist;
	}
	
public void saveSearches(long userId, List <Loan> loanlist) {
		
		int loanlistsize = loanlist.size();

		List <Usan> usan = new ArrayList<>();
	// delete existing items from uroprety that has same id
		deleteUsanList(userId);
	// create a new uroprety list 
		for(int x = 0;x<loanlistsize;x++) {
			// iterate the list and populate the uroprety list
			usan.add(new Usan(userId, loanlist.get(x).getId()));
			
		}
		
	// take a list save everything in that list to the database
		
		saveUsanList(usan);
	}

	public void saveUsanList (List <Usan> usanList) {
		
		int lenght = usanList.size();
		for(int x = 0;x<lenght;x++) {
			usanserv.saveUsan(usanList.get(x));
		}
	
	}
	
	
	
	public void deleteUsanList (long userId) {
		while(usanserv.getUsan(userId) != null) {
			usanserv.deleteUsan(usanserv.getUsan(userId));
		}
		
	}
	
	public UsanService getUsanInstance () {
		return this.usanserv;
		
	}
	
	public List <Loan> fromUsantoLoan (List <Usan> usa){
		List <Loan> myLoans = new ArrayList<>();
		for (int i = 0;i<usa.size();i++) {
			myLoans.add(lser.getLoan(usa.get(i).getId()));
		}
		
		return myLoans;
	}
	
}
