//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.06 at 06:02:47 PM MSK 
//


package ru.mrs.ws.server.soap.simple.wsdl.dev;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Employee" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "employee"
})
@XmlRootElement(name = "GetAllEmployeesResponse")
public class GetAllEmployeesResponse {

    @XmlElement(name = "Employee")
    protected List<GetAllEmployeesResponse.Employee> employee;

    /**
     * Gets the value of the employee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
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
     * {@link GetAllEmployeesResponse.Employee }
     * 
     * 
     */
    public List<GetAllEmployeesResponse.Employee> getEmployee() {
        if (employee == null) {
            employee = new ArrayList<GetAllEmployeesResponse.Employee>();
        }
        return this.employee;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "firstName",
        "lastName"
    })
    public static class Employee {

        @XmlElement(name = "ID", required = true)
        protected String id;
        @XmlElement(name = "FirstName", required = true)
        protected String firstName;
        @XmlElement(name = "LastName", required = true)
        protected String lastName;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the firstName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Sets the value of the firstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Gets the value of the lastName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Sets the value of the lastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastName(String value) {
            this.lastName = value;
        }

    }

}
