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
 * Inneholder elementene som skal være med i en 110-rekord ved oppdatering
 * 
 * <p>Java class for samhAjour110Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="samhAjour110Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="idOff" type="{http://www.rtv.no/NamespaceTSS}Tidoff"/>
 *         <element name="kodeIdType" type="{http://www.rtv.no/NamespaceTSS}TkodeIdenttype"/>
 *         <element name="kodeSamhType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="datoSamhFom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/>
 *         <element name="datoSamhTom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/>
 *         <element name="navnSamh" type="{http://www.rtv.no/NamespaceTSS}Tbeskr40v"/>
 *         <element name="kodeSpraak" type="{http://www.rtv.no/NamespaceTSS}Tkode04v"/>
 *         <element name="etatsMerke">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <whiteSpace value="collapse"/>
 *               <minLength value="0"/>
 *               <maxLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="utbetSperre">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="kodeKontrInt" type="{http://www.rtv.no/NamespaceTSS}Tkode04v"/>
 *         <element name="kodeStatus" type="{http://www.rtv.no/NamespaceTSS}Tkode04v"/>
 *         <element name="oppdater" type="{http://www.rtv.no/NamespaceTSS}Tgyldig"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "samhAjour110Type", propOrder = {
    "idOff",
    "kodeIdType",
    "kodeSamhType",
    "datoSamhFom",
    "datoSamhTom",
    "navnSamh",
    "kodeSpraak",
    "etatsMerke",
    "utbetSperre",
    "kodeKontrInt",
    "kodeStatus",
    "oppdater"
})
public class SamhAjour110Type {

    @XmlElement(required = true)
    protected String idOff;
    @XmlElement(required = true)
    protected String kodeIdType;
    @XmlElement(required = true)
    protected String kodeSamhType;
    @XmlElement(required = true)
    protected String datoSamhFom;
    @XmlElement(required = true)
    protected String datoSamhTom;
    @XmlElement(required = true)
    protected String navnSamh;
    @XmlElement(required = true)
    protected String kodeSpraak;
    @XmlElement(required = true)
    protected String etatsMerke;
    @XmlElement(required = true)
    protected String utbetSperre;
    @XmlElement(required = true)
    protected String kodeKontrInt;
    @XmlElement(required = true)
    protected String kodeStatus;
    @XmlElement(required = true)
    protected String oppdater;

    /**
     * Gets the value of the idOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOff() {
        return idOff;
    }

    /**
     * Sets the value of the idOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOff(String value) {
        this.idOff = value;
    }

    /**
     * Gets the value of the kodeIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeIdType() {
        return kodeIdType;
    }

    /**
     * Sets the value of the kodeIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeIdType(String value) {
        this.kodeIdType = value;
    }

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
     * Gets the value of the datoSamhFom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoSamhFom() {
        return datoSamhFom;
    }

    /**
     * Sets the value of the datoSamhFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoSamhFom(String value) {
        this.datoSamhFom = value;
    }

    /**
     * Gets the value of the datoSamhTom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoSamhTom() {
        return datoSamhTom;
    }

    /**
     * Sets the value of the datoSamhTom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoSamhTom(String value) {
        this.datoSamhTom = value;
    }

    /**
     * Gets the value of the navnSamh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavnSamh() {
        return navnSamh;
    }

    /**
     * Sets the value of the navnSamh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavnSamh(String value) {
        this.navnSamh = value;
    }

    /**
     * Gets the value of the kodeSpraak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeSpraak() {
        return kodeSpraak;
    }

    /**
     * Sets the value of the kodeSpraak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeSpraak(String value) {
        this.kodeSpraak = value;
    }

    /**
     * Gets the value of the etatsMerke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtatsMerke() {
        return etatsMerke;
    }

    /**
     * Sets the value of the etatsMerke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtatsMerke(String value) {
        this.etatsMerke = value;
    }

    /**
     * Gets the value of the utbetSperre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtbetSperre() {
        return utbetSperre;
    }

    /**
     * Sets the value of the utbetSperre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtbetSperre(String value) {
        this.utbetSperre = value;
    }

    /**
     * Gets the value of the kodeKontrInt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeKontrInt() {
        return kodeKontrInt;
    }

    /**
     * Sets the value of the kodeKontrInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeKontrInt(String value) {
        this.kodeKontrInt = value;
    }

    /**
     * Gets the value of the kodeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeStatus() {
        return kodeStatus;
    }

    /**
     * Sets the value of the kodeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeStatus(String value) {
        this.kodeStatus = value;
    }

    /**
     * Gets the value of the oppdater property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOppdater() {
        return oppdater;
    }

    /**
     * Sets the value of the oppdater property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOppdater(String value) {
        this.oppdater = value;
    }

}
