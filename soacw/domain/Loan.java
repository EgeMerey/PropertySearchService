package com.inm381.app.soacw.domain;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Loan", propOrder = {
    "id",
    "eligibility",
    "amount",
    "provider",
    "prop",
    "usr"
})
public class Loan {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    
    private Long id;
    private Float eligibility;
    private Float amount;
    @XmlElement(required = true)
    private String provider;
    private long prop;
    private long usr;
    
    
    
	public Loan(long usr, long prop,Long id, Float eligibility, Float amount, String provider) {
		
		this.id = id;
		this.eligibility = eligibility;
		this.amount = amount;
		this.provider = provider;
		this.usr = usr;
		this.prop = prop;
	}
	public Loan() {

	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	
	
	public String getProvider() {
		return provider;
	}
	public Float getEligibility() {
		return eligibility;
	}
	public void setEligibility(Float eligibility) {
		this.eligibility = eligibility;
	}
	public long getProp() {
		return prop;
	}
	public void setProp(long prop) {
		this.prop = prop;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	
	
	public long getUsr() {
		return usr;
	}
	public void setUsr(long usr) {
		this.usr = usr;
	}
	@Override
	public String toString() {
		return "Loan [id=" + id + ", eligibility=" + eligibility + ", amount=" + amount + ", provider=" + provider
				+ ", prop=" + prop + ", usr=" + usr + "]";
	}

	
	
	
	    
    
}
