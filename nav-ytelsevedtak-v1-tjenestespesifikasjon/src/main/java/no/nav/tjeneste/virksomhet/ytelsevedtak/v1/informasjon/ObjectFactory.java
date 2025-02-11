
package no.nav.tjeneste.virksomhet.ytelsevedtak.v1.informasjon;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.nav.tjeneste.virksomhet.ytelsevedtak.v1.informasjon package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.nav.tjeneste.virksomhet.ytelsevedtak.v1.informasjon
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Periode }
     * 
     * @return
     *     the new instance of {@link Periode }
     */
    public Periode createPeriode() {
        return new Periode();
    }

    /**
     * Create an instance of {@link Kodeverdi }
     * 
     * @return
     *     the new instance of {@link Kodeverdi }
     */
    public Kodeverdi createKodeverdi() {
        return new Kodeverdi();
    }

    /**
     * Create an instance of {@link Person }
     * 
     * @return
     *     the new instance of {@link Person }
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Tema }
     * 
     * @return
     *     the new instance of {@link Tema }
     */
    public Tema createTema() {
        return new Tema();
    }

    /**
     * Create an instance of {@link Vedtak }
     * 
     * @return
     *     the new instance of {@link Vedtak }
     */
    public Vedtak createVedtak() {
        return new Vedtak();
    }

    /**
     * Create an instance of {@link Sak }
     * 
     * @return
     *     the new instance of {@link Sak }
     */
    public Sak createSak() {
        return new Sak();
    }

    /**
     * Create an instance of {@link PersonYtelse }
     * 
     * @return
     *     the new instance of {@link PersonYtelse }
     */
    public PersonYtelse createPersonYtelse() {
        return new PersonYtelse();
    }

    /**
     * Create an instance of {@link Rettighetstype }
     * 
     * @return
     *     the new instance of {@link Rettighetstype }
     */
    public Rettighetstype createRettighetstype() {
        return new Rettighetstype();
    }

}
