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
 * <p>Java class for RegularMemberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegularMemberType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.org/GolfCountryClub}PersonType">
 *       &lt;sequence>
 *         &lt;element name="MembershipExpiry" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegularMemberType", propOrder = {
    "membershipExpiry"
})
public class RegularMemberType
    extends PersonType
{

    @XmlElement(name = "MembershipExpiry", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar membershipExpiry;

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

}
