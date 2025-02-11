
package no.nav.tjeneste.virksomhet.ytelsevedtak.v1.informasjon;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vedtak complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Vedtak">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="vedtaksperiode" type="{http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1/informasjon}Periode"/>
 *         <element name="rettighetstype" type="{http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1/informasjon}Rettighetstype"/>
 *         <element name="dagsats" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vedtak", namespace = "http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1/informasjon", propOrder = {
    "vedtaksperiode",
    "rettighetstype",
    "dagsats"
})
public class Vedtak {

    @XmlElement(required = true)
    protected Periode vedtaksperiode;
    @XmlElement(required = true)
    protected Rettighetstype rettighetstype;
    protected double dagsats;

    /**
     * Gets the value of the vedtaksperiode property.
     * 
     * @return
     *     possible object is
     *     {@link Periode }
     *     
     */
    public Periode getVedtaksperiode() {
        return vedtaksperiode;
    }

    /**
     * Sets the value of the vedtaksperiode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Periode }
     *     
     */
    public void setVedtaksperiode(Periode value) {
        this.vedtaksperiode = value;
    }

    /**
     * Gets the value of the rettighetstype property.
     * 
     * @return
     *     possible object is
     *     {@link Rettighetstype }
     *     
     */
    public Rettighetstype getRettighetstype() {
        return rettighetstype;
    }

    /**
     * Sets the value of the rettighetstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rettighetstype }
     *     
     */
    public void setRettighetstype(Rettighetstype value) {
        this.rettighetstype = value;
    }

    /**
     * Gets the value of the dagsats property.
     * 
     */
    public double getDagsats() {
        return dagsats;
    }

    /**
     * Sets the value of the dagsats property.
     * 
     */
    public void setDagsats(double value) {
        this.dagsats = value;
    }

}
