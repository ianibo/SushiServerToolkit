
package com.k_int.sushiServerToolkit.counter;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentifierType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdentifierType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Online_ISSN"/&gt;
 *     &lt;enumeration value="Print_ISSN"/&gt;
 *     &lt;enumeration value="EISSN"/&gt;
 *     &lt;enumeration value="ISSN"/&gt;
 *     &lt;enumeration value="ISBN"/&gt;
 *     &lt;enumeration value="Online_ISBN"/&gt;
 *     &lt;enumeration value="Print_ISBN"/&gt;
 *     &lt;enumeration value="ISNI"/&gt;
 *     &lt;enumeration value="DOI"/&gt;
 *     &lt;enumeration value="Proprietary"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IdentifierType")
@XmlEnum
public enum IdentifierType {

    @XmlEnumValue("Online_ISSN")
    ONLINE_ISSN("Online_ISSN"),
    @XmlEnumValue("Print_ISSN")
    PRINT_ISSN("Print_ISSN"),
    EISSN("EISSN"),
    ISSN("ISSN"),
    ISBN("ISBN"),
    @XmlEnumValue("Online_ISBN")
    ONLINE_ISBN("Online_ISBN"),
    @XmlEnumValue("Print_ISBN")
    PRINT_ISBN("Print_ISBN"),
    ISNI("ISNI"),
    DOI("DOI"),
    @XmlEnumValue("Proprietary")
    PROPRIETARY("Proprietary");
    private final String value;

    IdentifierType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IdentifierType fromValue(String v) {
        for (IdentifierType c: IdentifierType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
