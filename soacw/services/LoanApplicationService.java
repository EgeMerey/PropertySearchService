package com.inm381.app.soacw.services;

import com.inm381.app.soacw.domain.LoanApplication;
import com.inm381.app.soacw.repository.LoanApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanApplicationService {

    @Autowired 
    private LoanApplicationRepository LoanApplicationRepository;

    /**
     * CRUD - Create operation
     * @param u
     */
    public void createLoanApplication(LoanApplication u){
    	LoanApplicationRepository.save(u);
    }

    /**
     * CRUD - read operation
     * @return
     */
    public List<LoanApplication> getAllLoanApplications(){
        return LoanApplicationRepository.findAll();
    }

    /**
     * CRUD - read operation
     * @param id
     * @return
     */
    public LoanApplication getLoanApplication(Long id){
        return LoanApplicationRepository.findById(id).get();
    }


    /**
     * CRUD - Delete operation
     * @param u
     */
    public void deleteLoanApplication(LoanApplication u){
    	LoanApplicationRepository.delete(u);
    }

    /**
     * find by name
     * @param name
     * @return
     */

}
