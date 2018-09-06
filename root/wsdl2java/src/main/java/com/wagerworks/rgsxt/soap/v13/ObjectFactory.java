
package com.wagerworks.rgsxt.soap.v13;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wagerworks.rgsxt.soap.v13 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wagerworks.rgsxt.soap.v13
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FundModeRequest }
     * 
     */
    public FundModeRequest createFundModeRequest() {
        return new FundModeRequest();
    }

    /**
     * Create an instance of {@link FundModeRequestFreeSpin }
     * 
     */
    public FundModeRequestFreeSpin createFundModeRequestFreeSpin() {
        return new FundModeRequestFreeSpin();
    }

    /**
     * Create an instance of {@link FundModeRequestFreeSpinSummary }
     * 
     */
    public FundModeRequestFreeSpinSummary createFundModeRequestFreeSpinSummary() {
        return new FundModeRequestFreeSpinSummary();
    }

    /**
     * Create an instance of {@link FundModeRequestTournament }
     * 
     */
    public FundModeRequestTournament createFundModeRequestTournament() {
        return new FundModeRequestTournament();
    }

}
