
package com.wagerworks.rgsxt.soap.v6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconResponseStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReconResponseStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FAILURE"/&gt;
 *     &lt;enumeration value="SETTLED"/&gt;
 *     &lt;enumeration value="NOT_FOUND"/&gt;
 *     &lt;enumeration value="INSUFFICIENT_FUNDS"/&gt;
 *     &lt;enumeration value="FREESPIN_NO_REMAINING"/&gt;
 *     &lt;enumeration value="FREESPIN_TOKEN_EXPIRED"/&gt;
 *     &lt;enumeration value="FREESPIN_INVALID_CFG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReconResponseStatusEnum")
@XmlEnum
public enum ReconResponseStatusEnum {

    @XmlEnumValue("FAILURE")
    failure("FAILURE"),
    @XmlEnumValue("SETTLED")
    settled("SETTLED"),
    @XmlEnumValue("NOT_FOUND")
    not_FOUND("NOT_FOUND"),
    @XmlEnumValue("INSUFFICIENT_FUNDS")
    insufficient_FUNDS("INSUFFICIENT_FUNDS"),
    @XmlEnumValue("FREESPIN_NO_REMAINING")
    freespin_NO_REMAINING("FREESPIN_NO_REMAINING"),
    @XmlEnumValue("FREESPIN_TOKEN_EXPIRED")
    freespin_TOKEN_EXPIRED("FREESPIN_TOKEN_EXPIRED"),
    @XmlEnumValue("FREESPIN_INVALID_CFG")
    freespin_INVALID_CFG("FREESPIN_INVALID_CFG");
    private final String value;

    ReconResponseStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReconResponseStatusEnum fromValue(String v) {
        for (ReconResponseStatusEnum c: ReconResponseStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
