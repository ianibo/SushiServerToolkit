
package com.k_int.sushiServerToolkit.counter;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Content Provider.
 * 
 * <p>Java class for Vendor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vendor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.niso.org/schemas/counter}Organization"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vendor")
public class Vendor
    extends Organization
    implements Serializable
{

    private final static long serialVersionUID = 1L;

}
