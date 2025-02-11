
package no.nav.tjeneste.virksomhet.ytelsevedtak.v1;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import no.nav.tjeneste.virksomhet.ytelsevedtak.v1.feil.Sikkerhetsbegrensning;
import no.nav.tjeneste.virksomhet.ytelsevedtak.v1.feil.UgyldigInput;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.nav.tjeneste.virksomhet.ytelsevedtak.v1 package. 
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

    private static final QName _FinnYtelseVedtakListeSikkerhetsbegrensning_QNAME = new QName("http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1", "finnYtelseVedtakListeSikkerhetsbegrensning");
    private static final QName _FinnYtelseVedtakListeUgyldigInput_QNAME = new QName("http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1", "finnYtelseVedtakListeUgyldigInput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.nav.tjeneste.virksomhet.ytelsevedtak.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Ping }
     * 
     * @return
     *     the new instance of {@link Ping }
     */
    public Ping createPing() {
        return new Ping();
    }

    /**
     * Create an instance of {@link PingResponse }
     * 
     * @return
     *     the new instance of {@link PingResponse }
     */
    public PingResponse createPingResponse() {
        return new PingResponse();
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

    /**
     * Create an instance of {@link FinnYtelseVedtakListe }
     * 
     * @return
     *     the new instance of {@link FinnYtelseVedtakListe }
     */
    public FinnYtelseVedtakListe createFinnYtelseVedtakListe() {
        return new FinnYtelseVedtakListe();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sikkerhetsbegrensning }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Sikkerhetsbegrensning }{@code >}
     */
    @XmlElementDecl(namespace = "http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1", name = "finnYtelseVedtakListeSikkerhetsbegrensning")
    public JAXBElement<Sikkerhetsbegrensning> createFinnYtelseVedtakListeSikkerhetsbegrensning(Sikkerhetsbegrensning value) {
        return new JAXBElement<>(_FinnYtelseVedtakListeSikkerhetsbegrensning_QNAME, Sikkerhetsbegrensning.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UgyldigInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UgyldigInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1", name = "finnYtelseVedtakListeUgyldigInput")
    public JAXBElement<UgyldigInput> createFinnYtelseVedtakListeUgyldigInput(UgyldigInput value) {
        return new JAXBElement<>(_FinnYtelseVedtakListeUgyldigInput_QNAME, UgyldigInput.class, null, value);
    }

}
