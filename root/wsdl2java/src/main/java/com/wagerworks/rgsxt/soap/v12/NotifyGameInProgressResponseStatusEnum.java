
package com.wagerworks.rgsxt.soap.v12;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotifyGameInProgressResponseStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotifyGameInProgressResponseStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SUCCESS"/&gt;
 *     &lt;enumeration value="FAILURE"/&gt;
 *     &lt;enumeration value="NOT_FOUND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NotifyGameInProgressResponseStatusEnum")
@XmlEnum
public enum NotifyGameInProgressResponseStatusEnum {

    SUCCESS,
    FAILURE,
    NOT_FOUND;

    public String value() {
        return name();
    }

    public static NotifyGameInProgressResponseStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
