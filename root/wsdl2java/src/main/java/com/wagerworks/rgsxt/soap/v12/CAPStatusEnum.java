
package com.wagerworks.rgsxt.soap.v12;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CAPStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CAPStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PENDING"/&gt;
 *     &lt;enumeration value="NON_PENDING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CAPStatusEnum")
@XmlEnum
public enum CAPStatusEnum {

    PENDING,
    NON_PENDING;

    public String value() {
        return name();
    }

    public static CAPStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
