//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.19 at 11:41:17 PM EET 
//


package com.oyak.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RestrictedMemberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestrictedMemberType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.org/GolfCountryClub}PersonType">
 *       &lt;sequence>
 *         &lt;element name="MembershipExpiry" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="LimitedPlay" type="{http://www.example.org/GolfCountryClub}LimitedPlayType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictedMemberType", propOrder = {
    "membershipExpiry",
    "limitedPlay"
})
public class RestrictedMemberType
    extends PersonType
{

    @XmlElement(name = "MembershipExpiry", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar membershipExpiry;
    @XmlElement(name = "LimitedPlay", required = true)
    @XmlSchemaType(name = "string")
    protected LimitedPlayType limitedPlay;

    /**
     * Gets the value of the membershipExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMembershipExpiry() {
        return membershipExpiry;
    }

    /**
     * Sets the value of the membershipExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMembershipExpiry(XMLGregorianCalendar value) {
        this.membershipExpiry = value;
    }

    /**
     * Gets the value of the limitedPlay property.
     * 
     * @return
     *     possible object is
     *     {@link LimitedPlayType }
     *     
     */
    public LimitedPlayType getLimitedPlay() {
        return limitedPlay;
    }

    /**
     * Sets the value of the limitedPlay property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitedPlayType }
     *     
     */
    public void setLimitedPlay(LimitedPlayType value) {
        this.limitedPlay = value;
    }

}