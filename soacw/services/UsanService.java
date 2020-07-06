package com.inm381.app.soacw.services;

import com.inm381.app.soacw.domain.Usan;
import com.inm381.app.soacw.repository.UsanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsanService {

    @Autowired 
    private UsanRepository usanrepository;

    /**
     * CRUD - Create operation
     * @param u
     */
    public void saveUsan(Usan u){
    	usanrepository.save(u);
    }

    /**
     * CRUD - read operation
     * @return
     */
    public List<Usan> getAllUsans(){
        return usanrepository.findAll();
    }

    /**
     * CRUD - read operation
     * @param id
     * @return
     */
    public Usan getUsan(Long id){
        return usanrepository.findById(id).get();
    }


    /**
     * CRUD - Delete operation
     * @param u
     */
    public void deleteUsan(Usan u){
    	usanrepository.delete(u);
    }

    /**
     * find by name
     * @param name
     * @return
     */

    

}
