
package com.k_int.sushiServerToolkit.counter;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PubDate"/&gt;
 *     &lt;enumeration value="FirstAccessedOnline"/&gt;
 *     &lt;enumeration value="Proprietary"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DateType")
@XmlEnum
public enum DateType {

    @XmlEnumValue("PubDate")
    PUB_DATE("PubDate"),
    @XmlEnumValue("FirstAccessedOnline")
    FIRST_ACCESSED_ONLINE("FirstAccessedOnline"),
    @XmlEnumValue("Proprietary")
    PROPRIETARY("Proprietary");
    private final String value;

    DateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateType fromValue(String v) {
        for (DateType c: DateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
