
package com.wagerworks.rgsxt.soap.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STAKE"/&gt;
 *     &lt;enumeration value="WIN"/&gt;
 *     &lt;enumeration value="REFUND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActionEnum")
@XmlEnum
public enum ActionEnum {

    @XmlEnumValue("STAKE")
    stake("STAKE"),
    @XmlEnumValue("WIN")
    win("WIN"),
    @XmlEnumValue("REFUND")
    refund("REFUND");
    private final String value;

    ActionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionEnum fromValue(String v) {
        for (ActionEnum c: ActionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
