//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.31 at 03:44:03 PM BST 
//


package com.inm381.app.soacw.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loanApplication" type="{http://www.soacw.app.inm381.com/entity}LoanApplication"/>
 *         &lt;element name="payment" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loanApplication",
    "payment"
})
@XmlRootElement(name = "getCpaySRequest")
public class GetCpaySRequest {

    @XmlElement(required = true)
    protected LoanApplication loanApplication;
    protected float payment;

    
    
    public GetCpaySRequest() {

	}

	/**
     * Gets the value of the loanApplication property.
     * 
     * @return
     *     possible object is
     *     {@link LoanApplication }
     *     
     */
    public LoanApplication getLoanApplication() {
        return loanApplication;
    }

    /**
     * Sets the value of the loanApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanApplication }
     *     
     */
    public void setLoanApplication(LoanApplication value) {
        this.loanApplication = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     */
    public float getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     */
    public void setPayment(float value) {
        this.payment = value;
    }

}