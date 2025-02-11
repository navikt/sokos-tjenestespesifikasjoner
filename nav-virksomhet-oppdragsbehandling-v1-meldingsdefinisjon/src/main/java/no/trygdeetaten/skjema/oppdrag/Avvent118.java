//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package no.trygdeetaten.skjema.oppdrag;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Avvent - Referanse ID 118
 * 
 * <p>Java class for avvent-118 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="avvent-118">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="datoAvventFom" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tdato" minOccurs="0"/>
 *         <element name="datoAvventTom" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tdato" minOccurs="0"/>
 *         <element name="kodeArsak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="datoOverfores" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tdato" minOccurs="0"/>
 *         <element name="feilreg" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1"/>
 *               <enumeration value="J"/>
 *               <enumeration value="N"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "avvent-118", propOrder = {
    "datoAvventFom",
    "datoAvventTom",
    "kodeArsak",
    "datoOverfores",
    "feilreg"
})
public class Avvent118 {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoAvventFom;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoAvventTom;
    protected String kodeArsak;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoOverfores;
    protected String feilreg;

    /**
     * Gets the value of the datoAvventFom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoAvventFom() {
        return datoAvventFom;
    }

    /**
     * Sets the value of the datoAvventFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoAvventFom(XMLGregorianCalendar value) {
        this.datoAvventFom = value;
    }

    /**
     * Gets the value of the datoAvventTom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoAvventTom() {
        return datoAvventTom;
    }

    /**
     * Sets the value of the datoAvventTom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoAvventTom(XMLGregorianCalendar value) {
        this.datoAvventTom = value;
    }

    /**
     * Gets the value of the kodeArsak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeArsak() {
        return kodeArsak;
    }

    /**
     * Sets the value of the kodeArsak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeArsak(String value) {
        this.kodeArsak = value;
    }

    /**
     * Gets the value of the datoOverfores property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoOverfores() {
        return datoOverfores;
    }

    /**
     * Sets the value of the datoOverfores property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoOverfores(XMLGregorianCalendar value) {
        this.datoOverfores = value;
    }

    /**
     * Gets the value of the feilreg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeilreg() {
        return feilreg;
    }

    /**
     * Sets the value of the feilreg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeilreg(String value) {
        this.feilreg = value;
    }

}
