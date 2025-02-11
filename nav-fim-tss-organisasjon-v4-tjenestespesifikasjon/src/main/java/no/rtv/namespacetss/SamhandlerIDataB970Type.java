//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package no.rtv.namespacetss;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Inneholder elementene som skal være med ved spørring mot 970
 * 
 * <p>Java class for samhandlerIDataB970Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="samhandlerIDataB970Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="kodeSamhType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="kodeFagOmrade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="kodeAvtaleType" type="{http://www.rtv.no/NamespaceTSS}Tkodeavtaletype"/>
 *         <element name="aktuellDato" type="{http://www.rtv.no/NamespaceTSS}Tdato"/>
 *         <element name="historikk" type="{http://www.rtv.no/NamespaceTSS}Thistorikk"/>
 *         <element name="brukerID" type="{http://www.rtv.no/NamespaceTSS}Tbrukerid"/>
 *         <element name="antStatOmrader" type="{http://www.rtv.no/NamespaceTSS}Tantallforekomster"/>
 *         <element name="statOmrader" type="{http://www.rtv.no/NamespaceTSS}omradeTabellType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "samhandlerIDataB970Type", propOrder = {
    "kodeSamhType",
    "kodeFagOmrade",
    "kodeAvtaleType",
    "aktuellDato",
    "historikk",
    "brukerID",
    "antStatOmrader",
    "statOmrader"
})
public class SamhandlerIDataB970Type {

    @XmlElement(required = true)
    protected String kodeSamhType;
    @XmlElement(required = true)
    protected String kodeFagOmrade;
    @XmlElement(required = true)
    protected String kodeAvtaleType;
    @XmlElement(required = true)
    protected String aktuellDato;
    @XmlElement(required = true)
    protected String historikk;
    /**
     * Dette feltet skal ikke fylles ut av en bruker i et skjermbilde.
     * 
     */
    @XmlElement(required = true)
    protected String brukerID;
    @XmlElement(required = true)
    protected String antStatOmrader;
    @XmlElement(required = true)
    protected OmradeTabellType statOmrader;

    /**
     * Gets the value of the kodeSamhType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeSamhType() {
        return kodeSamhType;
    }

    /**
     * Sets the value of the kodeSamhType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeSamhType(String value) {
        this.kodeSamhType = value;
    }

    /**
     * Gets the value of the kodeFagOmrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeFagOmrade() {
        return kodeFagOmrade;
    }

    /**
     * Sets the value of the kodeFagOmrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeFagOmrade(String value) {
        this.kodeFagOmrade = value;
    }

    /**
     * Gets the value of the kodeAvtaleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeAvtaleType() {
        return kodeAvtaleType;
    }

    /**
     * Sets the value of the kodeAvtaleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeAvtaleType(String value) {
        this.kodeAvtaleType = value;
    }

    /**
     * Gets the value of the aktuellDato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAktuellDato() {
        return aktuellDato;
    }

    /**
     * Sets the value of the aktuellDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAktuellDato(String value) {
        this.aktuellDato = value;
    }

    /**
     * Gets the value of the historikk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistorikk() {
        return historikk;
    }

    /**
     * Sets the value of the historikk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistorikk(String value) {
        this.historikk = value;
    }

    /**
     * Dette feltet skal ikke fylles ut av en bruker i et skjermbilde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrukerID() {
        return brukerID;
    }

    /**
     * Sets the value of the brukerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBrukerID()
     */
    public void setBrukerID(String value) {
        this.brukerID = value;
    }

    /**
     * Gets the value of the antStatOmrader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntStatOmrader() {
        return antStatOmrader;
    }

    /**
     * Sets the value of the antStatOmrader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntStatOmrader(String value) {
        this.antStatOmrader = value;
    }

    /**
     * Gets the value of the statOmrader property.
     * 
     * @return
     *     possible object is
     *     {@link OmradeTabellType }
     *     
     */
    public OmradeTabellType getStatOmrader() {
        return statOmrader;
    }

    /**
     * Sets the value of the statOmrader property.
     * 
     * @param value
     *     allowed object is
     *     {@link OmradeTabellType }
     *     
     */
    public void setStatOmrader(OmradeTabellType value) {
        this.statOmrader = value;
    }

}
