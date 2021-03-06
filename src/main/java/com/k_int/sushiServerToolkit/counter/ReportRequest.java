
package com.k_int.sushiServerToolkit.counter;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Requestor" type="{http://www.niso.org/schemas/sushi}Requestor"/&gt;
 *         &lt;element name="CustomerReference" type="{http://www.niso.org/schemas/sushi}CustomerReference"/&gt;
 *         &lt;element name="ReportDefinition" type="{http://www.niso.org/schemas/sushi}ReportDefinition"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportRequest", namespace = "http://www.niso.org/schemas/sushi", propOrder = {
    "requestor",
    "customerReference",
    "reportDefinition"
})
public class ReportRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Requestor", required = true)
    protected Requestor requestor;
    @XmlElement(name = "CustomerReference", required = true)
    protected CustomerReference customerReference;
    @XmlElement(name = "ReportDefinition", required = true)
    protected ReportDefinition reportDefinition;
    @XmlAttribute(name = "Created")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlAttribute(name = "ID")
    protected String id;

    /**
     * Gets the value of the requestor property.
     * 
     * @return
     *     possible object is
     *     {@link Requestor }
     *     
     */
    public Requestor getRequestor() {
        return requestor;
    }

    /**
     * Sets the value of the requestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Requestor }
     *     
     */
    public void setRequestor(Requestor value) {
        this.requestor = value;
    }

    /**
     * Gets the value of the customerReference property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerReference }
     *     
     */
    public CustomerReference getCustomerReference() {
        return customerReference;
    }

    /**
     * Sets the value of the customerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerReference }
     *     
     */
    public void setCustomerReference(CustomerReference value) {
        this.customerReference = value;
    }

    /**
     * Gets the value of the reportDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDefinition }
     *     
     */
    public ReportDefinition getReportDefinition() {
        return reportDefinition;
    }

    /**
     * Sets the value of the reportDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDefinition }
     *     
     */
    public void setReportDefinition(ReportDefinition value) {
        this.reportDefinition = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

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

}
