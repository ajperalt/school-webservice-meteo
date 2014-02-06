
package com.superwebservice.publictypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.superwebservice.publictypes package. 
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

    private final static QName _ObtenirSituationMeteo_QNAME = new QName("http://www.superwebservice.com/publictypes", "obtenirSituationMeteo");
    private final static QName _ObtenirSituationMeteoResponse_QNAME = new QName("http://www.superwebservice.com/publictypes", "obtenirSituationMeteoResponse");
    private final static QName _DeposerRequete_QNAME = new QName("http://www.superwebservice.com/publictypes", "deposerRequete");
    private final static QName _DeposerRequeteResponse_QNAME = new QName("http://www.superwebservice.com/publictypes", "deposerRequeteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.superwebservice.publictypes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeposerRequete }
     * 
     */
    public DeposerRequete createDeposerRequete() {
        return new DeposerRequete();
    }

    /**
     * Create an instance of {@link ObtenirSituationMeteoResponse }
     * 
     */
    public ObtenirSituationMeteoResponse createObtenirSituationMeteoResponse() {
        return new ObtenirSituationMeteoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.superwebservice.com/publictypes", name = "obtenirSituationMeteo")
    public JAXBElement<String> createObtenirSituationMeteo(String value) {
        return new JAXBElement<String>(_ObtenirSituationMeteo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenirSituationMeteoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.superwebservice.com/publictypes", name = "obtenirSituationMeteoResponse")
    public JAXBElement<ObtenirSituationMeteoResponse> createObtenirSituationMeteoResponse(ObtenirSituationMeteoResponse value) {
        return new JAXBElement<ObtenirSituationMeteoResponse>(_ObtenirSituationMeteoResponse_QNAME, ObtenirSituationMeteoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeposerRequete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.superwebservice.com/publictypes", name = "deposerRequete")
    public JAXBElement<DeposerRequete> createDeposerRequete(DeposerRequete value) {
        return new JAXBElement<DeposerRequete>(_DeposerRequete_QNAME, DeposerRequete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.superwebservice.com/publictypes", name = "deposerRequeteResponse")
    public JAXBElement<String> createDeposerRequeteResponse(String value) {
        return new JAXBElement<String>(_DeposerRequeteResponse_QNAME, String.class, null, value);
    }

}
