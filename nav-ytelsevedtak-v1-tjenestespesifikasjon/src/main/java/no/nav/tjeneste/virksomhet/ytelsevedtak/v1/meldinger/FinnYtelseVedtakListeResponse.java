
package no.nav.tjeneste.virksomhet.ytelsevedtak.v1.meldinger;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import no.nav.tjeneste.virksomhet.ytelsevedtak.v1.informasjon.PersonYtelse;


/**
 * <p>Java class for FinnYtelseVedtakListeResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FinnYtelseVedtakListeResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="personYtelseListe" type="{http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1/informasjon}PersonYtelse" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinnYtelseVedtakListeResponse", namespace = "http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1/meldinger", propOrder = {
    "personYtelseListe"
})
public class FinnYtelseVedtakListeResponse {

    protected List<PersonYtelse> personYtelseListe;

    /**
     * Gets the value of the personYtelseListe property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personYtelseListe property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPersonYtelseListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonYtelse }
     * </p>
     * 
     * 
     * @return
     *     The value of the personYtelseListe property.
     */
    public List<PersonYtelse> getPersonYtelseListe() {
        if (personYtelseListe == null) {
            personYtelseListe = new ArrayList<>();
        }
        return this.personYtelseListe;
    }

}
