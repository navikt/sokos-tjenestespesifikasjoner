//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 03:51:50 PM CET 
//


package no.trygdeetaten.skjema.oppdrag;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Inneholder elementene som skal være med i en input 115-rekord: Avstemming
 *             
 * 
 * <p>Java class for avstemming-115 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="avstemming-115"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kodeKomponent" type="{http://www.trygdeetaten.no/skjema/oppdrag}TkodeKomponent"/&gt;
 *         &lt;element name="nokkelAvstemming" type="{http://www.trygdeetaten.no/skjema/oppdrag}TnokkelAvstemming"/&gt;
 *         &lt;element name="tidspktMelding" type="{http://www.trygdeetaten.no/skjema/oppdrag}TtidspktMelding"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "avstemming-115", propOrder = {
    "kodeKomponent",
    "nokkelAvstemming",
    "tidspktMelding"
})
public class Avstemming115 {

    @XmlElement(required = true)
    protected String kodeKomponent;
    @XmlElement(required = true)
    protected String nokkelAvstemming;
    @XmlElement(required = true)
    protected String tidspktMelding;

    /**
     * Gets the value of the kodeKomponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeKomponent() {
        return kodeKomponent;
    }

    /**
     * Sets the value of the kodeKomponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeKomponent(String value) {
        this.kodeKomponent = value;
    }

    /**
     * Gets the value of the nokkelAvstemming property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNokkelAvstemming() {
        return nokkelAvstemming;
    }

    /**
     * Sets the value of the nokkelAvstemming property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNokkelAvstemming(String value) {
        this.nokkelAvstemming = value;
    }

    /**
     * Gets the value of the tidspktMelding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTidspktMelding() {
        return tidspktMelding;
    }

    /**
     * Sets the value of the tidspktMelding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTidspktMelding(String value) {
        this.tidspktMelding = value;
    }

}
