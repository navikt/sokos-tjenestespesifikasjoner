
package no.nav.tjeneste.virksomhet.ytelsevedtak.v1.informasjon;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Sak complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Sak">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="fagsystemSakId" type="{http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1/informasjon}Identifikator"/>
 *         <element name="tema" type="{http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1/informasjon}Tema"/>
 *         <element name="vedtakListe" type="{http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1/informasjon}Vedtak" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sak", namespace = "http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1/informasjon", propOrder = {
    "fagsystemSakId",
    "tema",
    "vedtakListe"
})
public class Sak {

    @XmlElement(required = true)
    protected String fagsystemSakId;
    @XmlElement(required = true)
    protected Tema tema;
    @XmlElement(required = true)
    protected List<Vedtak> vedtakListe;

    /**
     * Gets the value of the fagsystemSakId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFagsystemSakId() {
        return fagsystemSakId;
    }

    /**
     * Sets the value of the fagsystemSakId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFagsystemSakId(String value) {
        this.fagsystemSakId = value;
    }

    /**
     * Gets the value of the tema property.
     * 
     * @return
     *     possible object is
     *     {@link Tema }
     *     
     */
    public Tema getTema() {
        return tema;
    }

    /**
     * Sets the value of the tema property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tema }
     *     
     */
    public void setTema(Tema value) {
        this.tema = value;
    }

    /**
     * Gets the value of the vedtakListe property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vedtakListe property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVedtakListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vedtak }
     * </p>
     * 
     * 
     * @return
     *     The value of the vedtakListe property.
     */
    public List<Vedtak> getVedtakListe() {
        if (vedtakListe == null) {
            vedtakListe = new ArrayList<>();
        }
        return this.vedtakListe;
    }

}
