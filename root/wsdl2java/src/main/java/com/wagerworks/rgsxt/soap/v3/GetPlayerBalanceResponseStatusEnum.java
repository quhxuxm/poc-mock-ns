
package com.wagerworks.rgsxt.soap.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPlayerBalanceResponseStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetPlayerBalanceResponseStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SUCCESS"/&gt;
 *     &lt;enumeration value="FAILURE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GetPlayerBalanceResponseStatusEnum")
@XmlEnum
public enum GetPlayerBalanceResponseStatusEnum {

    @XmlEnumValue("SUCCESS")
    success("SUCCESS"),
    @XmlEnumValue("FAILURE")
    failure("FAILURE");
    private final String value;

    GetPlayerBalanceResponseStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GetPlayerBalanceResponseStatusEnum fromValue(String v) {
        for (GetPlayerBalanceResponseStatusEnum c: GetPlayerBalanceResponseStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
