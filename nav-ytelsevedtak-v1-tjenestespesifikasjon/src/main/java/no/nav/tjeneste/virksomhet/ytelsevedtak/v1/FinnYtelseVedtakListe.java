
package no.nav.tjeneste.virksomhet.ytelsevedtak.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import no.nav.tjeneste.virksomhet.ytelsevedtak.v1.meldinger.FinnYtelseVedtakListeRequest;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="request" type="{http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1/meldinger}FinnYtelseVedtakListeRequest"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request"
})
@XmlRootElement(name = "finnYtelseVedtakListe", namespace = "http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1")
public class FinnYtelseVedtakListe {

    @XmlElement(required = true)
    protected FinnYtelseVedtakListeRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link FinnYtelseVedtakListeRequest }
     *     
     */
    public FinnYtelseVedtakListeRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinnYtelseVedtakListeRequest }
     *     
     */
    public void setRequest(FinnYtelseVedtakListeRequest value) {
        this.request = value;
    }

}
