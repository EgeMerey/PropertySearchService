package com.inm381.app.soacw.services;

import com.inm381.app.soacw.domain.Offer;
import com.inm381.app.soacw.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferService {

    @Autowired 
    private OfferRepository OfferRepository;

    /**	
     * CRUD - Create operation
     * @param u
     */
    public void createOffer(Offer u){
    	OfferRepository.save(u);
    }

    /**
     * CRUD - read operation
     * @return
     */
    public List<Offer> getAllOffers(){
        return OfferRepository.findAll();
    }

    /**
     * CRUD - read operation
     * @param id
     * @return
     */
    public Offer getOffer(Long id){
        return OfferRepository.findById(id).get();
    }


    /**
     * CRUD - Delete operation
     * @param u
     */
    public void deleteOffer(Offer u){
    	OfferRepository.delete(u);
    }

    /**
     * find by name
     * @param name
     * @return
     */
    
    
    public Offer findByOfferIdandAmount(long id , double amount ){
    	
    	return OfferRepository.exists(id , amount);
    }
    
    
    public Offer updateOffer(Offer details){
        if(OfferRepository.findById(details.getId()).isPresent()){
            Offer storedVal = OfferRepository.findById(details.getId()).get();

                // Update  & save values
                storedVal.equals(details);
                OfferRepository.save(storedVal);
        }
        //return the persisted user
        return OfferRepository.findById(details.getId()).get();
    }
}
