//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.19 at 11:41:17 PM EET 
//


package com.oyak.xml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="GolfCourse" type="{http://www.example.org/GolfCountryClub}GolfCourseType" maxOccurs="unbounded"/>
 *         &lt;element name="Member" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="RestrictedMember" type="{http://www.example.org/GolfCountryClub}RestrictedMemberType"/>
 *                   &lt;element name="RegularMember" type="{http://www.example.org/GolfCountryClub}RegularMemberType"/>
 *                   &lt;element name="ExclusiveMember" type="{http://www.example.org/GolfCountryClub}ExclusiveMemberType"/>
 *                 &lt;/choice>
 *                 &lt;attribute name="handicap" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Employee" type="{http://www.example.org/GolfCountryClub}EmployeeType" maxOccurs="unbounded"/>
 *         &lt;element name="ProShop">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GolfClub" type="{http://www.example.org/GolfCountryClub}GolfClubType" maxOccurs="unbounded"/>
 *                   &lt;element name="BoxOfBalls" type="{http://www.example.org/GolfCountryClub}BoxOfBallsType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "golfCourse",
    "member",
    "employee",
    "proShop"
})
@XmlRootElement(name = "GolfCountryClub")
public class GolfCountryClub {

    @XmlElement(name = "GolfCourse", required = true)
    protected List<GolfCourseType> golfCourse;
    @XmlElement(name = "Member", required = true)
    protected List<GolfCountryClub.Member> member;
    @XmlElement(name = "Employee", required = true)
    protected List<EmployeeType> employee;
    @XmlElement(name = "ProShop", required = true)
    protected GolfCountryClub.ProShop proShop;

    /**
     * Gets the value of the golfCourse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the golfCourse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGolfCourse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GolfCourseType }
     * 
     * 
     */
    public List<GolfCourseType> getGolfCourse() {
        if (golfCourse == null) {
            golfCourse = new ArrayList<GolfCourseType>();
        }
        return this.golfCourse;
    }

    /**
     * Gets the value of the member property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the member property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GolfCountryClub.Member }
     * 
     * 
     */
    public List<GolfCountryClub.Member> getMember() {
        if (member == null) {
            member = new ArrayList<GolfCountryClub.Member>();
        }
        return this.member;
    }

    /**
     * Gets the value of the employee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeType }
     * 
     * 
     */
    public List<EmployeeType> getEmployee() {
        if (employee == null) {
            employee = new ArrayList<EmployeeType>();
        }
        return this.employee;
    }

    /**
     * Gets the value of the proShop property.
     * 
     * @return
     *     possible object is
     *     {@link GolfCountryClub.ProShop }
     *     
     */
    public GolfCountryClub.ProShop getProShop() {
        return proShop;
    }

    /**
     * Sets the value of the proShop property.
     * 
     * @param value
     *     allowed object is
     *     {@link GolfCountryClub.ProShop }
     *     
     */
    public void setProShop(GolfCountryClub.ProShop value) {
        this.proShop = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="RestrictedMember" type="{http://www.example.org/GolfCountryClub}RestrictedMemberType"/>
     *         &lt;element name="RegularMember" type="{http://www.example.org/GolfCountryClub}RegularMemberType"/>
     *         &lt;element name="ExclusiveMember" type="{http://www.example.org/GolfCountryClub}ExclusiveMemberType"/>
     *       &lt;/choice>
     *       &lt;attribute name="handicap" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "restrictedMember",
        "regularMember",
        "exclusiveMember"
    })
    public static class Member {

        @XmlElement(name = "RestrictedMember")
        protected RestrictedMemberType restrictedMember;
        @XmlElement(name = "RegularMember")
        protected RegularMemberType regularMember;
        @XmlElement(name = "ExclusiveMember")
        protected ExclusiveMemberType exclusiveMember;
        @XmlAttribute(name = "handicap")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger handicap;

        /**
         * Gets the value of the restrictedMember property.
         * 
         * @return
         *     possible object is
         *     {@link RestrictedMemberType }
         *     
         */
        public RestrictedMemberType getRestrictedMember() {
            return restrictedMember;
        }

        /**
         * Sets the value of the restrictedMember property.
         * 
         * @param value
         *     allowed object is
         *     {@link RestrictedMemberType }
         *     
         */
        public void setRestrictedMember(RestrictedMemberType value) {
            this.restrictedMember = value;
        }

        /**
         * Gets the value of the regularMember property.
         * 
         * @return
         *     possible object is
         *     {@link RegularMemberType }
         *     
         */
        public RegularMemberType getRegularMember() {
            return regularMember;
        }

        /**
         * Sets the value of the regularMember property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegularMemberType }
         *     
         */
        public void setRegularMember(RegularMemberType value) {
            this.regularMember = value;
        }

        /**
         * Gets the value of the exclusiveMember property.
         * 
         * @return
         *     possible object is
         *     {@link ExclusiveMemberType }
         *     
         */
        public ExclusiveMemberType getExclusiveMember() {
            return exclusiveMember;
        }

        /**
         * Sets the value of the exclusiveMember property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExclusiveMemberType }
         *     
         */
        public void setExclusiveMember(ExclusiveMemberType value) {
            this.exclusiveMember = value;
        }

        /**
         * Gets the value of the handicap property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getHandicap() {
            return handicap;
        }

        /**
         * Sets the value of the handicap property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setHandicap(BigInteger value) {
            this.handicap = value;
        }

    }


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
     *         &lt;element name="GolfClub" type="{http://www.example.org/GolfCountryClub}GolfClubType" maxOccurs="unbounded"/>
     *         &lt;element name="BoxOfBalls" type="{http://www.example.org/GolfCountryClub}BoxOfBallsType" maxOccurs="unbounded"/>
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
        "golfClub",
        "boxOfBalls"
    })
    public static class ProShop {

        @XmlElement(name = "GolfClub", required = true)
        protected List<GolfClubType> golfClub;
        @XmlElement(name = "BoxOfBalls", required = true)
        protected List<BoxOfBallsType> boxOfBalls;

        /**
         * Gets the value of the golfClub property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the golfClub property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGolfClub().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GolfClubType }
         * 
         * 
         */
        public List<GolfClubType> getGolfClub() {
            if (golfClub == null) {
                golfClub = new ArrayList<GolfClubType>();
            }
            return this.golfClub;
        }

        /**
         * Gets the value of the boxOfBalls property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the boxOfBalls property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBoxOfBalls().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BoxOfBallsType }
         * 
         * 
         */
        public List<BoxOfBallsType> getBoxOfBalls() {
            if (boxOfBalls == null) {
                boxOfBalls = new ArrayList<BoxOfBallsType>();
            }
            return this.boxOfBalls;
        }

    }

}
