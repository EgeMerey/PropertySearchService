package com.inm381.app.soacw.domain;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Offer", propOrder = {
    "id",
    "offer"
})
public class Offer {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private long Id;
    private double offer;
    @OneToOne
    private Uroperty uroperty;
	public Offer() {
		
	}

	public Offer(long id, Float offer, Uroperty uroperty) {
		Id = id;
		this.offer = offer;
		this.uroperty = uroperty;
	}


	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public double getOffer() {
		return offer;
	}
	public void setOffer(double offer) {
		this.offer = offer;
	}
	public Uroperty getUroperty() {
		return uroperty;
	}
	public void setUroperty(Uroperty uroperty) {
		this.uroperty = uroperty;
	}


	@Override
	public String toString() {
		return "Offer [Id=" + Id + ", offer=" + offer + ", uroperty=" + uroperty + "]";
	}
	
	
	

}
