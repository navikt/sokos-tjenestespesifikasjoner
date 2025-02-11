
package no.nav.tjeneste.virksomhet.ytelsevedtak.v1.informasjon;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Informasjon om kodeverdien som blir brukt fra kodeverket
 * 
 * <p>Java class for Kodeverdi complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Kodeverdi">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *       <attribute name="kodeRef" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       <attribute name="termnavn" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kodeverdi", namespace = "http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1/informasjon", propOrder = {
    "value"
})
@XmlSeeAlso({
    Tema.class,
    Rettighetstype.class
})
public class Kodeverdi {

    @XmlValue
    protected String value;
    /**
     * Referanse til koden som blir brukt
     * 
     */
    @XmlAttribute(name = "kodeRef")
    @XmlSchemaType(name = "anyURI")
    protected String kodeRef;
    /**
     * Termnavn på koden som blir brukt
     * 
     */
    @XmlAttribute(name = "termnavn")
    protected String termnavn;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Referanse til koden som blir brukt
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeRef() {
        return kodeRef;
    }

    /**
     * Sets the value of the kodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKodeRef()
     */
    public void setKodeRef(String value) {
        this.kodeRef = value;
    }

    /**
     * Termnavn på koden som blir brukt
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermnavn() {
        return termnavn;
    }

    /**
     * Sets the value of the termnavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTermnavn()
     */
    public void setTermnavn(String value) {
        this.termnavn = value;
    }

}
