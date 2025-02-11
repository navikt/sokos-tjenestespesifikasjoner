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
 * Dette er typen som beskriver spørsmålelementene, attributene og tekst  som input inn mot TSS
 * 
 * <p>Java class for samhandlerIDataB931Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="samhandlerIDataB931Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="idOffTSS" type="{http://www.rtv.no/NamespaceTSS}TTSSidoff"/>
 *           <element name="OFFid" type="{http://www.rtv.no/NamespaceTSS}TidOFF2"/>
 *         </choice>
 *         <element name="kodeRelRolle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="kodeSamhType2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="kodeRelNiva" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="buffnr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="aktuellDato" type="{http://www.rtv.no/NamespaceTSS}Tdato"/>
 *         <element name="historikk" type="{http://www.rtv.no/NamespaceTSS}Thistorikk"/>
 *         <element name="brukerID" type="{http://www.rtv.no/NamespaceTSS}Tbrukerid"/>
 *         <element name="ak1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ak2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "samhandlerIDataB931Type", propOrder = {
    "idOffTSS",
    "ofFid",
    "kodeRelRolle",
    "kodeSamhType2",
    "kodeRelNiva",
    "buffnr",
    "aktuellDato",
    "historikk",
    "brukerID",
    "ak1",
    "ak2"
})
public class SamhandlerIDataB931Type {

    protected String idOffTSS;
    @XmlElement(name = "OFFid")
    protected TidOFF2 ofFid;
    @XmlElement(required = true)
    protected String kodeRelRolle;
    @XmlElement(required = true)
    protected String kodeSamhType2;
    @XmlElement(required = true)
    protected String kodeRelNiva;
    @XmlElement(required = true)
    protected String buffnr;
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
    protected String ak1;
    @XmlElement(required = true)
    protected String ak2;

    /**
     * Gets the value of the idOffTSS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOffTSS() {
        return idOffTSS;
    }

    /**
     * Sets the value of the idOffTSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOffTSS(String value) {
        this.idOffTSS = value;
    }

    /**
     * Gets the value of the ofFid property.
     * 
     * @return
     *     possible object is
     *     {@link TidOFF2 }
     *     
     */
    public TidOFF2 getOFFid() {
        return ofFid;
    }

    /**
     * Sets the value of the ofFid property.
     * 
     * @param value
     *     allowed object is
     *     {@link TidOFF2 }
     *     
     */
    public void setOFFid(TidOFF2 value) {
        this.ofFid = value;
    }

    /**
     * Gets the value of the kodeRelRolle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeRelRolle() {
        return kodeRelRolle;
    }

    /**
     * Sets the value of the kodeRelRolle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeRelRolle(String value) {
        this.kodeRelRolle = value;
    }

    /**
     * Gets the value of the kodeSamhType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeSamhType2() {
        return kodeSamhType2;
    }

    /**
     * Sets the value of the kodeSamhType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeSamhType2(String value) {
        this.kodeSamhType2 = value;
    }

    /**
     * Gets the value of the kodeRelNiva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeRelNiva() {
        return kodeRelNiva;
    }

    /**
     * Sets the value of the kodeRelNiva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeRelNiva(String value) {
        this.kodeRelNiva = value;
    }

    /**
     * Gets the value of the buffnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuffnr() {
        return buffnr;
    }

    /**
     * Sets the value of the buffnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuffnr(String value) {
        this.buffnr = value;
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
     * Gets the value of the ak1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAk1() {
        return ak1;
    }

    /**
     * Sets the value of the ak1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAk1(String value) {
        this.ak1 = value;
    }

    /**
     * Gets the value of the ak2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAk2() {
        return ak2;
    }

    /**
     * Sets the value of the ak2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAk2(String value) {
        this.ak2 = value;
    }

}
