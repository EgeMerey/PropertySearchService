package com.inm381.app.soacw.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanApplication", propOrder = {
    "id",
    "loan"
})
public class LoanApplication {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Long Id;
    @OneToOne
    private User user;
    @OneToOne
    @XmlElement(required = true)
    private Loan loan;
	public LoanApplication(Long id, User user, Loan loan) {
	
		Id = id;
		this.user = user;
		this.loan = loan;
	}
	public LoanApplication() {
		
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Loan getLoan() {
		return loan;
	}
	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	@Override
	public String toString() {
		return "LoanApplication [Id=" + Id + ", user=" + user + ", loan=" + loan + "]";
	}

	
    

}
