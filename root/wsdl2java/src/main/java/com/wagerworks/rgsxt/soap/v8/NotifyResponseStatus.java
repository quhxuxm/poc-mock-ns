
package com.wagerworks.rgsxt.soap.v8;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotifyResponseStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotifyResponseStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SUCCESS"/&gt;
 *     &lt;enumeration value="FAILURE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NotifyResponseStatus")
@XmlEnum
public enum NotifyResponseStatus {

    SUCCESS,
    FAILURE;

    public String value() {
        return name();
    }

    public static NotifyResponseStatus fromValue(String v) {
        return valueOf(v);
    }

}
