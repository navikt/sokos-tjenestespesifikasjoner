
package no.nav.tjeneste.virksomhet.ytelsevedtak.v1.feil;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForretningsmessigUnntak complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ForretningsmessigUnntak">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="feilkilde" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="feilaarsak" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="feilmelding" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="tidspunkt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForretningsmessigUnntak", namespace = "http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1/feil", propOrder = {
    "feilkilde",
    "feilaarsak",
    "feilmelding",
    "tidspunkt"
})
@XmlSeeAlso({
    Sikkerhetsbegrensning.class,
    UgyldigInput.class
})
public class ForretningsmessigUnntak {

    @XmlElement(required = true)
    protected String feilkilde;
    @XmlElement(required = true)
    protected String feilaarsak;
    @XmlElement(required = true)
    protected String feilmelding;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tidspunkt;

    /**
     * Gets the value of the feilkilde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeilkilde() {
        return feilkilde;
    }

    /**
     * Sets the value of the feilkilde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeilkilde(String value) {
        this.feilkilde = value;
    }

    /**
     * Gets the value of the feilaarsak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeilaarsak() {
        return feilaarsak;
    }

    /**
     * Sets the value of the feilaarsak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeilaarsak(String value) {
        this.feilaarsak = value;
    }

    /**
     * Gets the value of the feilmelding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeilmelding() {
        return feilmelding;
    }

    /**
     * Sets the value of the feilmelding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeilmelding(String value) {
        this.feilmelding = value;
    }

    /**
     * Gets the value of the tidspunkt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTidspunkt() {
        return tidspunkt;
    }

    /**
     * Sets the value of the tidspunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTidspunkt(XMLGregorianCalendar value) {
        this.tidspunkt = value;
    }

}
