
package no.nav.tjeneste.virksomhet.ytelsevedtak.v1.meldinger;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.nav.tjeneste.virksomhet.ytelsevedtak.v1.meldinger package. 
 * <p>An ObjectFactory allows you to programmatically 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.nav.tjeneste.virksomhet.ytelsevedtak.v1.meldinger
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FinnYtelseVedtakListeRequest }
     * 
     * @return
     *     the new instance of {@link FinnYtelseVedtakListeRequest }
     */
    public FinnYtelseVedtakListeRequest createFinnYtelseVedtakListeRequest() {
        return new FinnYtelseVedtakListeRequest();
    }

    /**
     * Create an instance of {@link FinnYtelseVedtakListeResponse }
     * 
     * @return
     *     the new instance of {@link FinnYtelseVedtakListeResponse }
     */
    public FinnYtelseVedtakListeResponse createFinnYtelseVedtakListeResponse() {
        return new FinnYtelseVedtakListeResponse();
    }

}
