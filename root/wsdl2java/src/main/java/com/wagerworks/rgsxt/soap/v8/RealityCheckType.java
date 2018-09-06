
package com.wagerworks.rgsxt.soap.v8;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RealityCheckType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RealityCheckType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONTINUE"/&gt;
 *     &lt;enumeration value="CLOSE"/&gt;
 *     &lt;enumeration value="VIEW_ACCOUNT_HISTORY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RealityCheckType")
@XmlEnum
public enum RealityCheckType {

    CONTINUE,
    CLOSE,
    VIEW_ACCOUNT_HISTORY;

    public String value() {
        return name();
    }

    public static RealityCheckType fromValue(String v) {
        return valueOf(v);
    }

}
