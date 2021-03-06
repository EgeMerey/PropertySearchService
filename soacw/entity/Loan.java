//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.31 at 03:44:03 PM BST 
//


package com.inm381.app.soacw.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Loan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Loan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="eligibility" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="provider" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prop" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="usr" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
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

    protected long id;
    protected float eligibility;
    protected float amount;
    @XmlElement(required = true)
    protected String provider;
    protected long prop;
    protected long usr;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the eligibility property.
     * 
     */
    public float getEligibility() {
        return eligibility;
    }

    /**
     * Sets the value of the eligibility property.
     * 
     */
    public void setEligibility(float value) {
        this.eligibility = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public float getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(float value) {
        this.amount = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvider(String value) {
        this.provider = value;
    }

    /**
     * Gets the value of the prop property.
     * 
     */
    public long getProp() {
        return prop;
    }

    /**
     * Sets the value of the prop property.
     * 
     */
    public void setProp(long value) {
        this.prop = value;
    }

    /**
     * Gets the value of the usr property.
     * 
     */
    public long getUsr() {
        return usr;
    }

    /**
     * Sets the value of the usr property.
     * 
     */
    public void setUsr(long value) {
        this.usr = value;
    }

}
