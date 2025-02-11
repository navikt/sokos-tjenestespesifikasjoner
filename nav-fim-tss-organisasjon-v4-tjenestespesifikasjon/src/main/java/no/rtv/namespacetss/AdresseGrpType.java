//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package no.rtv.namespacetss;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Dette er en type som beskriver elementene til en adresse gruppe
 * 
 * <p>Java class for adresseGrpType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="adresseGrpType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="avdNr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="kodeAdresseType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="beskrAdresseType" type="{http://www.rtv.no/NamespaceTSS}Tbeskr40v"/>
 *         <element name="kodeLand">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <whiteSpace value="collapse"/>
 *               <maxLength value="4"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="kommuneNr">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <whiteSpace value="collapse"/>
 *               <maxLength value="4"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="postNr">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <whiteSpace value="collapse"/>
 *               <maxLength value="4"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="poststed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="datoAdresseFom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/>
 *         <element name="datoAdresseTom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/>
 *         <element name="gyldigAdresse" type="{http://www.rtv.no/NamespaceTSS}Tgyldig"/>
 *         <element name="kilde" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="brukerId" type="{http://www.rtv.no/NamespaceTSS}Tbrukerid"/>
 *         <element name="tidReg" type="{http://www.rtv.no/NamespaceTSS}Ttidreg"/>
 *         <element name="antAdrLinje" type="{http://www.rtv.no/NamespaceTSS}Tantallforekomster"/>
 *         <element name="adrLinjeInfo" type="{http://www.rtv.no/NamespaceTSS}adrLinjeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adresseGrpType", propOrder = {
    "avdNr",
    "kodeAdresseType",
    "beskrAdresseType",
    "kodeLand",
    "kommuneNr",
    "postNr",
    "poststed",
    "datoAdresseFom",
    "datoAdresseTom",
    "gyldigAdresse",
    "kilde",
    "brukerId",
    "tidReg",
    "antAdrLinje",
    "adrLinjeInfo"
})
@XmlSeeAlso({
    AdresseSamhType.class
})
public class AdresseGrpType {

    @XmlElement(required = true)
    protected String avdNr;
    @XmlElement(required = true)
    protected String kodeAdresseType;
    @XmlElement(required = true)
    protected String beskrAdresseType;
    @XmlElement(required = true)
    protected String kodeLand;
    @XmlElement(required = true)
    protected String kommuneNr;
    @XmlElement(required = true)
    protected String postNr;
    @XmlElement(required = true)
    protected String poststed;
    @XmlElement(required = true)
    protected String datoAdresseFom;
    @XmlElement(required = true)
    protected String datoAdresseTom;
    @XmlElement(required = true)
    protected String gyldigAdresse;
    @XmlElement(required = true)
    protected String kilde;
    @XmlElement(required = true)
    protected String brukerId;
    @XmlElement(required = true)
    protected String tidReg;
    @XmlElement(required = true)
    protected String antAdrLinje;
    protected AdrLinjeType adrLinjeInfo;

    /**
     * Gets the value of the avdNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvdNr() {
        return avdNr;
    }

    /**
     * Sets the value of the avdNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvdNr(String value) {
        this.avdNr = value;
    }

    /**
     * Gets the value of the kodeAdresseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeAdresseType() {
        return kodeAdresseType;
    }

    /**
     * Sets the value of the kodeAdresseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeAdresseType(String value) {
        this.kodeAdresseType = value;
    }

    /**
     * Gets the value of the beskrAdresseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeskrAdresseType() {
        return beskrAdresseType;
    }

    /**
     * Sets the value of the beskrAdresseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeskrAdresseType(String value) {
        this.beskrAdresseType = value;
    }

    /**
     * Gets the value of the kodeLand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeLand() {
        return kodeLand;
    }

    /**
     * Sets the value of the kodeLand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeLand(String value) {
        this.kodeLand = value;
    }

    /**
     * Gets the value of the kommuneNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKommuneNr() {
        return kommuneNr;
    }

    /**
     * Sets the value of the kommuneNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKommuneNr(String value) {
        this.kommuneNr = value;
    }

    /**
     * Gets the value of the postNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostNr() {
        return postNr;
    }

    /**
     * Sets the value of the postNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostNr(String value) {
        this.postNr = value;
    }

    /**
     * Gets the value of the poststed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoststed() {
        return poststed;
    }

    /**
     * Sets the value of the poststed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoststed(String value) {
        this.poststed = value;
    }

    /**
     * Gets the value of the datoAdresseFom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoAdresseFom() {
        return datoAdresseFom;
    }

    /**
     * Sets the value of the datoAdresseFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoAdresseFom(String value) {
        this.datoAdresseFom = value;
    }

    /**
     * Gets the value of the datoAdresseTom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoAdresseTom() {
        return datoAdresseTom;
    }

    /**
     * Sets the value of the datoAdresseTom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoAdresseTom(String value) {
        this.datoAdresseTom = value;
    }

    /**
     * Gets the value of the gyldigAdresse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGyldigAdresse() {
        return gyldigAdresse;
    }

    /**
     * Sets the value of the gyldigAdresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGyldigAdresse(String value) {
        this.gyldigAdresse = value;
    }

    /**
     * Gets the value of the kilde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKilde() {
        return kilde;
    }

    /**
     * Sets the value of the kilde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKilde(String value) {
        this.kilde = value;
    }

    /**
     * Gets the value of the brukerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrukerId() {
        return brukerId;
    }

    /**
     * Sets the value of the brukerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrukerId(String value) {
        this.brukerId = value;
    }

    /**
     * Gets the value of the tidReg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTidReg() {
        return tidReg;
    }

    /**
     * Sets the value of the tidReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTidReg(String value) {
        this.tidReg = value;
    }

    /**
     * Gets the value of the antAdrLinje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntAdrLinje() {
        return antAdrLinje;
    }

    /**
     * Sets the value of the antAdrLinje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntAdrLinje(String value) {
        this.antAdrLinje = value;
    }

    /**
     * Gets the value of the adrLinjeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdrLinjeType }
     *     
     */
    public AdrLinjeType getAdrLinjeInfo() {
        return adrLinjeInfo;
    }

    /**
     * Sets the value of the adrLinjeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdrLinjeType }
     *     
     */
    public void setAdrLinjeInfo(AdrLinjeType value) {
        this.adrLinjeInfo = value;
    }

}
