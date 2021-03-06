//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.19 at 11:41:17 PM EET 
//


package com.oyak.xml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GolfCourseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GolfCourseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Yardage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="Par" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="Handicap">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Slope" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NumberOfHoles" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" fixed="18" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GolfCourseType", propOrder = {
    "name",
    "yardage",
    "par",
    "handicap",
    "slope"
})
public class GolfCourseType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Yardage", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger yardage;
    @XmlElement(name = "Par", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger par;
    @XmlElement(name = "Handicap")
    protected float handicap;
    @XmlElement(name = "Slope", required = true)
    protected String slope;
    @XmlAttribute(name = "NumberOfHoles")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfHoles;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the yardage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYardage() {
        return yardage;
    }

    /**
     * Sets the value of the yardage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYardage(BigInteger value) {
        this.yardage = value;
    }

    /**
     * Gets the value of the par property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPar() {
        return par;
    }

    /**
     * Sets the value of the par property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPar(BigInteger value) {
        this.par = value;
    }

    /**
     * Gets the value of the handicap property.
     * 
     */
    public float getHandicap() {
        return handicap;
    }

    /**
     * Sets the value of the handicap property.
     * 
     */
    public void setHandicap(float value) {
        this.handicap = value;
    }

    /**
     * Gets the value of the slope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlope() {
        return slope;
    }

    /**
     * Sets the value of the slope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlope(String value) {
        this.slope = value;
    }

    /**
     * Gets the value of the numberOfHoles property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfHoles() {
        if (numberOfHoles == null) {
            return new BigInteger("18");
        } else {
            return numberOfHoles;
        }
    }

    /**
     * Sets the value of the numberOfHoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfHoles(BigInteger value) {
        this.numberOfHoles = value;
    }

}
