
package no.nav.tjeneste.virksomhet.ytelsevedtak.v1.informasjon;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * En periode angir et tidsintervall med fra-og-med og til-og-med.
 * 
 * <p>Java class for Periode complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Periode">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="fom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="tom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Periode", namespace = "http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1/informasjon", propOrder = {
    "fom",
    "tom"
})
public class Periode {

    /**
     * Fra-og-med dato. Merk! xsd:date kan valgfritt returneres med eller uten tidssone
     *                         av
     *                         tilbyder. Dette må håndteres av konsumenter.
     * 
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fom;
    /**
     * Til-og-med dato. Merk! xsd:date kan valgfritt returneres med eller uten tidssone
     *                         av
     *                         tilbyder. Dette må håndteres av konsumenter.
     * 
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tom;

    /**
     * Fra-og-med dato. Merk! xsd:date kan valgfritt returneres med eller uten tidssone
     *                         av
     *                         tilbyder. Dette må håndteres av konsumenter.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFom() {
        return fom;
    }

    /**
     * Sets the value of the fom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getFom()
     */
    public void setFom(XMLGregorianCalendar value) {
        this.fom = value;
    }

    /**
     * Til-og-med dato. Merk! xsd:date kan valgfritt returneres med eller uten tidssone
     *                         av
     *                         tilbyder. Dette må håndteres av konsumenter.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTom() {
        return tom;
    }

    /**
     * Sets the value of the tom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTom()
     */
    public void setTom(XMLGregorianCalendar value) {
        this.tom = value;
    }

}
