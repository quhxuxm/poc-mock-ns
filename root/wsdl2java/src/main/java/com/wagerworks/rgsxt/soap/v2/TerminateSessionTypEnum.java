
package com.wagerworks.rgsxt.soap.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminateSessionTypEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TerminateSessionTypEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LOGGED_OUT"/&gt;
 *     &lt;enumeration value="TERMINATED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TerminateSessionTypEnum")
@XmlEnum
public enum TerminateSessionTypEnum {

    @XmlEnumValue("LOGGED_OUT")
    logged_OUT("LOGGED_OUT"),
    @XmlEnumValue("TERMINATED")
    terminated("TERMINATED");
    private final String value;

    TerminateSessionTypEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TerminateSessionTypEnum fromValue(String v) {
        for (TerminateSessionTypEnum c: TerminateSessionTypEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
