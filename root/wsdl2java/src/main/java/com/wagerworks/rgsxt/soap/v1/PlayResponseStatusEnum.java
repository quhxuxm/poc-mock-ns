
package com.wagerworks.rgsxt.soap.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlayResponseStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlayResponseStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REJECTED"/&gt;
 *     &lt;enumeration value="SETTLED"/&gt;
 *     &lt;enumeration value="FAILURE"/&gt;
 *     &lt;enumeration value="INSUFFICIENT_FUNDS"/&gt;
 *     &lt;enumeration value="SESSION_EXPIRED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PlayResponseStatusEnum")
@XmlEnum
public enum PlayResponseStatusEnum {

    @XmlEnumValue("REJECTED")
    rejected("REJECTED"),
    @XmlEnumValue("SETTLED")
    settled("SETTLED"),
    @XmlEnumValue("FAILURE")
    failure("FAILURE"),
    @XmlEnumValue("INSUFFICIENT_FUNDS")
    insufficient_FUNDS("INSUFFICIENT_FUNDS"),
    @XmlEnumValue("SESSION_EXPIRED")
    session_EXPIRED("SESSION_EXPIRED");
    private final String value;

    PlayResponseStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlayResponseStatusEnum fromValue(String v) {
        for (PlayResponseStatusEnum c: PlayResponseStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
