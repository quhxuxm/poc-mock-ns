
package com.wagerworks.rgsxt.soap.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitResponseStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InitResponseStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SUCCESS"/&gt;
 *     &lt;enumeration value="FAILURE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InitResponseStatusEnum")
@XmlEnum
public enum InitResponseStatusEnum {

    @XmlEnumValue("SUCCESS")
    success("SUCCESS"),
    @XmlEnumValue("FAILURE")
    failure("FAILURE");
    private final String value;

    InitResponseStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InitResponseStatusEnum fromValue(String v) {
        for (InitResponseStatusEnum c: InitResponseStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
