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
 * Inneholder elementene som skal være med i en 130-rekord ved oppdatering
 * 
 * <p>Java class for samhAjour130Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="samhAjour130Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="avdNr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="kodeAdrType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="kodeLand">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="4"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="kommuneNr">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="4"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="postNr">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <pattern value="\d{0}"/>
 *               <pattern value="\d{4}"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="datoAdrFom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/>
 *         <element name="datoAdrTom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/>
 *         <element name="gyldigAdr" type="{http://www.rtv.no/NamespaceTSS}Tgyldig"/>
 *         <element name="adrLinjeData" type="{http://www.rtv.no/NamespaceTSS}adrLinjeType" minOccurs="0"/>
 *         <element name="adrRegionData" type="{http://www.rtv.no/NamespaceTSS}TAdrRegion" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "samhAjour130Type", propOrder = {
    "avdNr",
    "kodeAdrType",
    "kodeLand",
    "kommuneNr",
    "postNr",
    "datoAdrFom",
    "datoAdrTom",
    "gyldigAdr",
    "adrLinjeData",
    "adrRegionData"
})
public class SamhAjour130Type {

    @XmlElement(required = true)
    protected String avdNr;
    @XmlElement(required = true)
    protected String kodeAdrType;
    @XmlElement(required = true)
    protected String kodeLand;
    @XmlElement(required = true)
    protected String kommuneNr;
    @XmlElement(required = true)
    protected String postNr;
    @XmlElement(required = true)
    protected String datoAdrFom;
    @XmlElement(required = true)
    protected String datoAdrTom;
    @XmlElement(required = true)
    protected String gyldigAdr;
    protected AdrLinjeType adrLinjeData;
    protected TAdrRegion adrRegionData;

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
     * Gets the value of the kodeAdrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeAdrType() {
        return kodeAdrType;
    }

    /**
     * Sets the value of the kodeAdrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeAdrType(String value) {
        this.kodeAdrType = value;
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
     * Gets the value of the datoAdrFom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoAdrFom() {
        return datoAdrFom;
    }

    /**
     * Sets the value of the datoAdrFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoAdrFom(String value) {
        this.datoAdrFom = value;
    }

    /**
     * Gets the value of the datoAdrTom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoAdrTom() {
        return datoAdrTom;
    }

    /**
     * Sets the value of the datoAdrTom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoAdrTom(String value) {
        this.datoAdrTom = value;
    }

    /**
     * Gets the value of the gyldigAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGyldigAdr() {
        return gyldigAdr;
    }

    /**
     * Sets the value of the gyldigAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGyldigAdr(String value) {
        this.gyldigAdr = value;
    }

    /**
     * Gets the value of the adrLinjeData property.
     * 
     * @return
     *     possible object is
     *     {@link AdrLinjeType }
     *     
     */
    public AdrLinjeType getAdrLinjeData() {
        return adrLinjeData;
    }

    /**
     * Sets the value of the adrLinjeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdrLinjeType }
     *     
     */
    public void setAdrLinjeData(AdrLinjeType value) {
        this.adrLinjeData = value;
    }

    /**
     * Gets the value of the adrRegionData property.
     * 
     * @return
     *     possible object is
     *     {@link TAdrRegion }
     *     
     */
    public TAdrRegion getAdrRegionData() {
        return adrRegionData;
    }

    /**
     * Sets the value of the adrRegionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAdrRegion }
     *     
     */
    public void setAdrRegionData(TAdrRegion value) {
        this.adrRegionData = value;
    }

}
