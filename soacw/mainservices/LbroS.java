package com.inm381.app.soacw.mainservices;

import java.util.List;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.inm381.app.soacw.domain.Loan;
import com.inm381.app.soacw.domain.User;

import com.inm381.app.soacw.services.LoanService;

@Primary
@Service
public class LbroS extends LoanService{
	
	public List <Loan>loanList(Loan l, User u){
		return getLoanEligibility(l.getAmount(), u.getCscore());	
	}
}
