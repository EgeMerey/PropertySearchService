package com.inm381.app.soacw.domain;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Property", propOrder = {
    "id",
    "price",
    "type",
    "condition",
    "location",
    "bedroom",
    "features"
})
public class Property {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Long id;
    private Float price;
    @XmlElement(required = true)
    private String type;
    private Integer bedroom;
    @XmlElement(required = true)
    private String condition;
    @XmlElement(required = true)
    private String location;
    @XmlElement(required = true)
    private String features;
    
    
	public Property(Long id, Float price, String type, Integer bedroom, String condition, String location,
			String features) {

		this.id = id;
		this.price = price;
		this.type = type;
		this.bedroom = bedroom;
		this.condition = condition;
		this.location = location;
		this.features = features;
		
	}

	public Property() {
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getBedroom() {
		return bedroom;
	}

	public void setBedroom(Integer bedroom) {
		this.bedroom = bedroom;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	@Override
	public String toString() {
		return "Property [id=" + id + ", price=" + price + ", type=" + type + ", bedroom=" + bedroom + ", condition="
				+ condition + ", location=" + location + ", features=" + features + "]";
	}
	
   
   
}

