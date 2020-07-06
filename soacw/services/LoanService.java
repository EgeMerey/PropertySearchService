package com.inm381.app.soacw.services;

import com.inm381.app.soacw.domain.Loan;
import com.inm381.app.soacw.domain.Property;
import com.inm381.app.soacw.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LoanService {

    @Autowired 
    private LoanRepository loanrepository;

    /**
     * CRUD - Create operation
     * @param u
     */
    public void createLoan(Loan u){
    	loanrepository.save(u);
    }

    /**
     * CRUD - read operation
     * @return
     */
    public List<Loan> getAllLoans(){
        return loanrepository.findAll();
    }

    /**
     * CRUD - read operation
     * @param id
     * @return
     */
    public Loan getLoan(Long id){
        return loanrepository.findById(id).get();
    }

    /**
     * CRUD - update operation
     * @param details
     * @return
     */
    public Loan updateLoan(Loan details){
        if(loanrepository.findById(details.getId()).isPresent()){
        	Loan storedVal = loanrepository.findById(details.getId()).get();

       
                storedVal.equals(details);

                loanrepository.save(storedVal);
        }
       
        return loanrepository.findById(details.getId()).get();
    }

    /**
     * CRUD - Delete operation
     * @param u
     */
    public void deleteLoan(Loan u){
    	loanrepository.delete(u);
    }

    /**
     * find by name
     * @param name
     * @return
     */
    
	 //custom 
    public List <Loan> getLoanEligibility (Float propPrice, Float Cscore){
    	
    	return loanrepository.getLoanEligibility(propPrice, Cscore);
    }
   

}
