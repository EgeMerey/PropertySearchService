package com.inm381.app.soacw.services;

import com.inm381.app.soacw.domain.Uroperty;
import com.inm381.app.soacw.repository.UropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UropertyService {

    @Autowired 
    private UropertyRepository uropertyrepository;

    /**
     * CRUD - Create operation
     * @param u
     */
    public void saveUroperty(Uroperty u){
    	uropertyrepository.save(u);
    }

    /**
     * CRUD - read operation
     * @return
     */
    public List<Uroperty> getAllUropertys(){
        return uropertyrepository.findAll();
    }

    /**
     * CRUD - read operation
     * @param id
     * @return
     */
    public Uroperty getUroperty(Long id){
        return uropertyrepository.findById(id).get();
    }


    /**
     * CRUD - Delete operation
     * @param u
     */
    public void deleteUroperty(Uroperty u){
    	uropertyrepository.delete(u);
    }
    
    public void deleteUropertybyUserId (long userId) {
    	List <Uroperty> lsd = uropertyrepository.deletebyUser(userId);
    	System.out.println("Fucking fat philip    " + lsd.size());
    	for (Uroperty u : lsd) {
    		deleteUroperty(u);
    	}
    }
    
    public List <Uroperty> getBunchOfUroperty(long userid) {
    	
    	return uropertyrepository.finduropertybyid(userid);
    	
    }
    /**
     * find by name
     * @param name
     * @return
     */

}
