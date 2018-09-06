
package com.wagerworks.rgsxt.soap.v12;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNFINISHED_GAME_PENDING"/&gt;
 *     &lt;enumeration value="AUTO_REVEAL_NOT_A_WINNER"/&gt;
 *     &lt;enumeration value="AUTO_REVEAL_GAME_WIN_LOW_TIER"/&gt;
 *     &lt;enumeration value="AUTO_REVEAL_GAME_WIN_HIGH_TIER"/&gt;
 *     &lt;enumeration value="WAGER_RECONCILIATION_WAGER_NOT_LOGGED"/&gt;
 *     &lt;enumeration value="WAGER_RECONCILIATION_GAME_WIN"/&gt;
 *     &lt;enumeration value="WAGER_RECONCILIATION_GAME_WIN_CLAIM"/&gt;
 *     &lt;enumeration value="WAGER_RECONCILIATION_GAME_NON_WIN"/&gt;
 *     &lt;enumeration value="GAME_NON_WIN"/&gt;
 *     &lt;enumeration value="GAME_WIN_LOW_TIER"/&gt;
 *     &lt;enumeration value="GAME_WIN_HIGH_TIER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NotificationTypeEnum")
@XmlEnum
public enum NotificationTypeEnum {

    UNFINISHED_GAME_PENDING,
    AUTO_REVEAL_NOT_A_WINNER,
    AUTO_REVEAL_GAME_WIN_LOW_TIER,
    AUTO_REVEAL_GAME_WIN_HIGH_TIER,
    WAGER_RECONCILIATION_WAGER_NOT_LOGGED,
    WAGER_RECONCILIATION_GAME_WIN,
    WAGER_RECONCILIATION_GAME_WIN_CLAIM,
    WAGER_RECONCILIATION_GAME_NON_WIN,
    GAME_NON_WIN,
    GAME_WIN_LOW_TIER,
    GAME_WIN_HIGH_TIER;

    public String value() {
        return name();
    }

    public static NotificationTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
