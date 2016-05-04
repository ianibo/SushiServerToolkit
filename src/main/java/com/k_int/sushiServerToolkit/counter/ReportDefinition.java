
package com.k_int.sushiServerToolkit.counter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Input arguments for the report.
 * 
 * <p>Java class for ReportDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Filters"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="UsageDateRange" type="{http://www.niso.org/schemas/sushi}Range"/&gt;
 *                   &lt;element name="Filter" type="{http://www.niso.org/schemas/sushi}FilterName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ReportAttribute" type="{http://www.niso.org/schemas/sushi}ReportAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Release" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportDefinition", namespace = "http://www.niso.org/schemas/sushi", propOrder = {
    "filters"
})
public class ReportDefinition
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Filters", required = true)
    protected ReportDefinition.Filters filters;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Release", required = true)
    protected String release;

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDefinition.Filters }
     *     
     */
    public ReportDefinition.Filters getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDefinition.Filters }
     *     
     */
    public void setFilters(ReportDefinition.Filters value) {
        this.filters = value;
    }

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
     * Gets the value of the release property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelease() {
        return release;
    }

    /**
     * Sets the value of the release property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelease(String value) {
        this.release = value;
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
     *         &lt;element name="UsageDateRange" type="{http://www.niso.org/schemas/sushi}Range"/&gt;
     *         &lt;element name="Filter" type="{http://www.niso.org/schemas/sushi}FilterName" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ReportAttribute" type="{http://www.niso.org/schemas/sushi}ReportAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "usageDateRange",
        "filter",
        "reportAttribute"
    })
    public static class Filters
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "UsageDateRange", namespace = "http://www.niso.org/schemas/sushi", required = true)
        protected Range usageDateRange;
        @XmlElement(name = "Filter", namespace = "http://www.niso.org/schemas/sushi")
        protected List<FilterName> filter;
        @XmlElement(name = "ReportAttribute", namespace = "http://www.niso.org/schemas/sushi")
        protected List<ReportAttribute> reportAttribute;

        /**
         * Gets the value of the usageDateRange property.
         * 
         * @return
         *     possible object is
         *     {@link Range }
         *     
         */
        public Range getUsageDateRange() {
            return usageDateRange;
        }

        /**
         * Sets the value of the usageDateRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link Range }
         *     
         */
        public void setUsageDateRange(Range value) {
            this.usageDateRange = value;
        }

        /**
         * Gets the value of the filter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the filter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFilter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FilterName }
         * 
         * 
         */
        public List<FilterName> getFilter() {
            if (filter == null) {
                filter = new ArrayList<FilterName>();
            }
            return this.filter;
        }

        /**
         * Gets the value of the reportAttribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reportAttribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReportAttribute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReportAttribute }
         * 
         * 
         */
        public List<ReportAttribute> getReportAttribute() {
            if (reportAttribute == null) {
                reportAttribute = new ArrayList<ReportAttribute>();
            }
            return this.reportAttribute;
        }

    }

}
