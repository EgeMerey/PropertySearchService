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
 * <p>Java class for CardPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardPayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ElecPayment" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="LoanApp" type="{http://www.soacw.app.inm381.com/entity}LoanApplication"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPayment", propOrder = {
    "id",
    "elecPayment",
    "loanApp"
})
public class CardPayment {

    protected long id;
    @XmlElement(name = "ElecPayment")
    protected float elecPayment;
    @XmlElement(name = "LoanApp", required = true)
    protected LoanApplication loanApp;

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
     * Gets the value of the elecPayment property.
     * 
     */
    public float getElecPayment() {
        return elecPayment;
    }

    /**
     * Sets the value of the elecPayment property.
     * 
     */
    public void setElecPayment(float value) {
        this.elecPayment = value;
    }

    /**
     * Gets the value of the loanApp property.
     * 
     * @return
     *     possible object is
     *     {@link LoanApplication }
     *     
     */
    public LoanApplication getLoanApp() {
        return loanApp;
    }

    /**
     * Sets the value of the loanApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanApplication }
     *     
     */
    public void setLoanApp(LoanApplication value) {
        this.loanApp = value;
    }

}
