
package com.k_int.sushiServerToolkit.counter;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the actual response expected from a COUNTER_SUSHI service. A combination of the SUSHI ReportResponse with the COUNTER "Report" added. NOTE: The ReportRequest and ReportResponse are defined in the SUSHI1_7.xsd and the COUNTER report is defined in the Counter4_1.xsd.
 * 
 * <p>Java class for CounterReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CounterReportResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.niso.org/schemas/sushi}ReportResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Report" type="{http://www.niso.org/schemas/counter}Reports"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterReportResponse", namespace = "http://www.niso.org/schemas/sushi/counter", propOrder = {
    "report"
})
public class CounterReportResponse
    extends ReportResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Report", required = true, nillable = true)
    protected Reports report;

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link Reports }
     *     
     */
    public Reports getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reports }
     *     
     */
    public void setReport(Reports value) {
        this.report = value;
    }

}
