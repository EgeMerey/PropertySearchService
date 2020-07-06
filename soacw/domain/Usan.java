package com.inm381.app.soacw.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Usan", propOrder = {
    "id",
    "loanid",
    "userid"
})
@Entity
public class Usan {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Long Id;
    private long userId;
    private long loanId;
	public Usan(Long id, long userId, long loanId) {

		Id = id;
		this.userId = userId;
		this.loanId = loanId;
	}
	
	public Usan(long userId, long loanId) {

		this.userId = userId;
		this.loanId = loanId;
	}
	
	public Usan() {
	
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
	public long getLoanId() {
		return loanId;
	}
	public void setLoanId(long loanyId) {
		this.loanId = loanyId;
	}
	@Override
	public String toString() {
		return "Usan [Id=" + Id + ", userId=" + userId + ", loanyId=" + loanId + "]";
	}
    
    
    
    
}
