
package com.wagerworks.rgsxt.soap.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoidResponseStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VoidResponseStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SETTLED"/&gt;
 *     &lt;enumeration value="FAILURE"/&gt;
 *     &lt;enumeration value="REJECTED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VoidResponseStatusEnum")
@XmlEnum
public enum VoidResponseStatusEnum {

    @XmlEnumValue("SETTLED")
    settled("SETTLED"),
    @XmlEnumValue("FAILURE")
    failure("FAILURE"),
    @XmlEnumValue("REJECTED")
    rejected("REJECTED");
    private final String value;

    VoidResponseStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VoidResponseStatusEnum fromValue(String v) {
        for (VoidResponseStatusEnum c: VoidResponseStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
