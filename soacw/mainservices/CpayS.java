package com.inm381.app.soacw.mainservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inm381.app.soacw.domain.Loan;
import com.inm381.app.soacw.domain.LoanApplication;
import com.inm381.app.soacw.services.CardPaymentService;
import com.inm381.app.soacw.services.LoanService;


@Service
public class CpayS extends CardPaymentService{

	@Autowired
	private LoanService loanser;
	public String getPayment(LoanApplication loanapp, Float payment) {
		String res = null;
		Loan loan = loanapp.getLoan();
		if (payment < loanapp.getLoan().getAmount()) {
			res = "Payment Sucessfull";
			loan.setAmount(loan.getAmount() - payment);
			loanser.updateLoan(loan);
		}
		else {
			res = "Payment failed";
		}
		return res;
	}
}
