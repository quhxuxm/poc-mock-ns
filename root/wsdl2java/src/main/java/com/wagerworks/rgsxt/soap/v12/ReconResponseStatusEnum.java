
package com.wagerworks.rgsxt.soap.v12;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconResponseStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReconResponseStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FAILURE"/&gt;
 *     &lt;enumeration value="SETTLED"/&gt;
 *     &lt;enumeration value="NOT_FOUND"/&gt;
 *     &lt;enumeration value="INSUFFICIENT_FUNDS"/&gt;
 *     &lt;enumeration value="FREESPIN_NO_REMAINING"/&gt;
 *     &lt;enumeration value="FREESPIN_TOKEN_EXPIRED"/&gt;
 *     &lt;enumeration value="FREESPIN_INVALID_CFG"/&gt;
 *     &lt;enumeration value="ERROR_WITH_CAP_PENDING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReconResponseStatusEnum")
@XmlEnum
public enum ReconResponseStatusEnum {

    FAILURE,
    SETTLED,
    NOT_FOUND,
    INSUFFICIENT_FUNDS,
    FREESPIN_NO_REMAINING,
    FREESPIN_TOKEN_EXPIRED,
    FREESPIN_INVALID_CFG,
    ERROR_WITH_CAP_PENDING;

    public String value() {
        return name();
    }

    public static ReconResponseStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
