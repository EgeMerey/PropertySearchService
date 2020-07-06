package com.inm381.app.soacw.services;

import com.inm381.app.soacw.domain.CardPayment;
import com.inm381.app.soacw.repository.CardPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardPaymentService {

    @Autowired 
    private CardPaymentRepository cardpaymentrepository;

    /**
     * CRUD - Create operation
     * @param u
     */
    public void createCardPayment(CardPayment u){
    	cardpaymentrepository.save(u);
    }

    /**
     * CRUD - read operation
     * @return
     */
    public List<CardPayment> getAllCardPayments(){
        return cardpaymentrepository.findAll();
    }

    /**
     * CRUD - read operation
     * @param id
     * @return
     */
    public CardPayment getCardPayment(Long id){
        return cardpaymentrepository.findById(id).get();
    }


    /**
     * CRUD - Delete operation
     * @param u
     */
    public void deleteCardPayment(CardPayment u){
    	cardpaymentrepository.delete(u);
    }

    /**
     * find by name
     * @param name
     * @return
     */

}
