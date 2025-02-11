
package no.nav.tjeneste.virksomhet.ytelsevedtak.v1.meldinger;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import no.nav.tjeneste.virksomhet.ytelsevedtak.v1.informasjon.Person;
import no.nav.tjeneste.virksomhet.ytelsevedtak.v1.informasjon.Tema;


/**
 * <p>Java class for FinnYtelseVedtakListeRequest complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FinnYtelseVedtakListeRequest">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="personListe" type="{http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1/informasjon}Person" maxOccurs="1000"/>
 *         <element name="temaListe" type="{http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1/informasjon}Tema" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinnYtelseVedtakListeRequest", namespace = "http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1/meldinger", propOrder = {
    "personListe",
    "temaListe"
})
public class FinnYtelseVedtakListeRequest {

    @XmlElement(required = true)
    protected List<Person> personListe;
    @XmlElement(required = true)
    protected List<Tema> temaListe;

    /**
     * Gets the value of the personListe property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personListe property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPersonListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Person }
     * </p>
     * 
     * 
     * @return
     *     The value of the personListe property.
     */
    public List<Person> getPersonListe() {
        if (personListe == null) {
            personListe = new ArrayList<>();
        }
        return this.personListe;
    }

    /**
     * Gets the value of the temaListe property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temaListe property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTemaListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tema }
     * </p>
     * 
     * 
     * @return
     *     The value of the temaListe property.
     */
    public List<Tema> getTemaListe() {
        if (temaListe == null) {
            temaListe = new ArrayList<>();
        }
        return this.temaListe;
    }

}
