
package com.k_int.sushiServerToolkit.counter;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContributorIdentifierType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContributorIdentifierType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ISNI"/&gt;
 *     &lt;enumeration value="ORCID"/&gt;
 *     &lt;enumeration value="Name"/&gt;
 *     &lt;enumeration value="Proprietary"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContributorIdentifierType")
@XmlEnum
public enum ContributorIdentifierType {

    ISNI("ISNI"),
    ORCID("ORCID"),
    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("Proprietary")
    PROPRIETARY("Proprietary");
    private final String value;

    ContributorIdentifierType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContributorIdentifierType fromValue(String v) {
        for (ContributorIdentifierType c: ContributorIdentifierType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
