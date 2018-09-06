
package com.wagerworks.rgsxt.soap.v4;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wagerworks.rgsxt.soap.v4 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wagerworks.rgsxt.soap.v4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Play }
     * 
     */
    public Play createPlay() {
        return new Play();
    }

    /**
     * Create an instance of {@link BodyRequest }
     * 
     */
    public BodyRequest createBodyRequest() {
        return new BodyRequest();
    }

    /**
     * Create an instance of {@link PlayResponse }
     * 
     */
    public PlayResponse createPlayResponse() {
        return new PlayResponse();
    }

    /**
     * Create an instance of {@link AuthHeaderResponse }
     * 
     */
    public AuthHeaderResponse createAuthHeaderResponse() {
        return new AuthHeaderResponse();
    }

    /**
     * Create an instance of {@link Recon }
     * 
     */
    public Recon createRecon() {
        return new Recon();
    }

    /**
     * Create an instance of {@link RGSGameRequest }
     * 
     */
    public RGSGameRequest createRGSGameRequest() {
        return new RGSGameRequest();
    }

    /**
     * Create an instance of {@link Messages }
     * 
     */
    public Messages createMessages() {
        return new Messages();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

}
