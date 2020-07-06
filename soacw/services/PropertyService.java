package com.inm381.app.soacw.services;

import com.inm381.app.soacw.domain.Property;
import com.inm381.app.soacw.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PropertyService {

    @Autowired 
    private PropertyRepository propertyrepository;

    /**
     * CRUD - Create operation
     * @param u
     */
    public void createProperty(Property u){
    	propertyrepository.save(u);
    }

    /**
     * CRUD - read operation
     * @return
     */
    	public List<Property> getAllPropertys(){
        return propertyrepository.findAll();
    }

    /**
     * CRUD - read operation
     * @param id
     * @return
     */
    public Property getProperty(Long id){
        return propertyrepository.findById(id).get();
    }


    /**
     * CRUD - Delete operation
     * @param u
     */
    public void deleteProperty(Property u){
    	propertyrepository.delete(u);
    }

    public List <Property> getByBedroom(int a){
    	
    	return propertyrepository.searchByBedroom(a);
    }
    
	public List <Property> getByCondition(String a){
	    	
	    	return propertyrepository.searchByCondition(a.toLowerCase());
	    }
	
	public List <Property> getByPrice(Float a){
		
		return propertyrepository.searchByPrice(a);
	}
	
	public List <Property> getByFeatures(String a){
		
		return propertyrepository.searchByFeatures(a.toLowerCase());
	}
	
	public List <Property> getByType(String a){
		
		return propertyrepository.searchByType(a.toLowerCase());
	}
	
	public List <Property> getByLocation(String a){
		
		return propertyrepository.searchByLocation(a.toLowerCase());
	}
	public Property getById(Long a){
		
		return propertyrepository.searchById(a);
	}

    
    

}
