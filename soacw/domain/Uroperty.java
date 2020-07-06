package com.inm381.app.soacw.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Uroperty", propOrder = {
    "id",
    "loanid",
    "propertyid"
})
public class Uroperty {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Long Id;
    private long userId;
    private long propertyId;
	public Uroperty(Long id, long userId, long propertyId) {
		
		Id = id;
		this.userId = userId;
		this.propertyId = propertyId;
	}
	
	public Uroperty(long userId, long propertyId) {

		this.userId = userId;
		this.propertyId = propertyId;
	}
	public Uroperty() {
	
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(long propertyId) {
		this.propertyId = propertyId;
	}
	
	@Override
	public String toString() {
		return "Uroperty [Id=" + Id + ", userId=" + userId + ", propertyId=" + propertyId + "]";
	}
    
    
    
    
}
