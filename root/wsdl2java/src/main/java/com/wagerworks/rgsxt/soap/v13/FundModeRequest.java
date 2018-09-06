
package com.wagerworks.rgsxt.soap.v13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundModeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundModeRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.wagerworks.com/rgsXT/soap/v6/}FundModeRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Freespin" type="{http://www.wagerworks.com/rgsXT/soap/v13/}FundModeRequestFreeSpin" minOccurs="0"/&gt;
 *         &lt;element name="Tournament" type="{http://www.wagerworks.com/rgsXT/soap/v13/}FundModeRequestTournament" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundModeRequest", propOrder = {
    "freespin",
    "tournament"
})
public class FundModeRequest
    extends com.wagerworks.rgsxt.soap.v6.FundModeRequest
{

    @XmlElement(name = "Freespin")
    protected FundModeRequestFreeSpin freespin;
    @XmlElement(name = "Tournament")
    protected FundModeRequestTournament tournament;

    /**
     * Gets the value of the freespin property.
     * 
     * @return
     *     possible object is
     *     {@link FundModeRequestFreeSpin }
     *     
     */
    public FundModeRequestFreeSpin getFreespin() {
        return freespin;
    }

    /**
     * Sets the value of the freespin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundModeRequestFreeSpin }
     *     
     */
    public void setFreespin(FundModeRequestFreeSpin value) {
        this.freespin = value;
    }

    /**
     * Gets the value of the tournament property.
     * 
     * @return
     *     possible object is
     *     {@link FundModeRequestTournament }
     *     
     */
    public FundModeRequestTournament getTournament() {
        return tournament;
    }

    /**
     * Sets the value of the tournament property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundModeRequestTournament }
     *     
     */
    public void setTournament(FundModeRequestTournament value) {
        this.tournament = value;
    }

}
