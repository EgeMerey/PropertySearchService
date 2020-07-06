package com.inm381.app.soacw.domain;



import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPayment", propOrder = {
    "id",
    "elecPayment",
    "loanApp"
})
public class CardPayment {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Long Id;
    @XmlElement(name = "ElecPayment")
    private Float ElecPayment;
    @OneToOne
    @XmlElement(name = "LoanApp", required = true)
    private LoanApplication LoanApp;
	public CardPayment(Long id, Float elecPayment, LoanApplication loanApp) {
		
		Id = id;
		ElecPayment = elecPayment;
		LoanApp = loanApp;
	}
	public CardPayment() {
		
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Float getElecPayment() {
		return ElecPayment;
	}
	public void setElecPayment(Float elecPayment) {
		ElecPayment = elecPayment;
	}
	public LoanApplication getLoanApp() {
		return LoanApp;
	}
	public void setLoanApp(LoanApplication loanApp) {
		LoanApp = loanApp;
	}
	@Override
	public String toString() {
		return "CardPayment [Id=" + Id + ", ElecPayment=" + ElecPayment + ", LoanApp=" + LoanApp + "]";
	}
	
	
    
    
    

}
