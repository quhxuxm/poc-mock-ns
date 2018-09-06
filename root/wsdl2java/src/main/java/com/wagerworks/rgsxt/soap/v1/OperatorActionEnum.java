
package com.wagerworks.rgsxt.soap.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatorActionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatorActionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMPLETE"/&gt;
 *     &lt;enumeration value="CANCEL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperatorActionEnum")
@XmlEnum
public enum OperatorActionEnum {

    @XmlEnumValue("COMPLETE")
    complete("COMPLETE"),
    @XmlEnumValue("CANCEL")
    cancel("CANCEL");
    private final String value;

    OperatorActionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperatorActionEnum fromValue(String v) {
        for (OperatorActionEnum c: OperatorActionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
