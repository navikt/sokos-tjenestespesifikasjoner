
package no.nav.tjeneste.virksomhet.ytelsevedtak.v1.informasjon;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tema complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Tema">
 *   <simpleContent>
 *     <extension base="<http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1/informasjon>Kodeverdi">
 *       <attribute name="kodeverksRef" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tema", namespace = "http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1/informasjon")
public class Tema
    extends Kodeverdi
{

    @XmlAttribute(name = "kodeverksRef")
    @XmlSchemaType(name = "anyURI")
    protected String kodeverksRef;

    /**
     * Gets the value of the kodeverksRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeverksRef() {
        return kodeverksRef;
    }

    /**
     * Sets the value of the kodeverksRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeverksRef(String value) {
        this.kodeverksRef = value;
    }

}
