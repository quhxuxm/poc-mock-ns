
package com.wagerworks.rgsxt.soap.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndGameSessionResponseStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EndGameSessionResponseStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SUCCESS"/&gt;
 *     &lt;enumeration value="FAILURE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EndGameSessionResponseStatusEnum")
@XmlEnum
public enum EndGameSessionResponseStatusEnum {

    @XmlEnumValue("SUCCESS")
    success("SUCCESS"),
    @XmlEnumValue("FAILURE")
    failure("FAILURE");
    private final String value;

    EndGameSessionResponseStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EndGameSessionResponseStatusEnum fromValue(String v) {
        for (EndGameSessionResponseStatusEnum c: EndGameSessionResponseStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
