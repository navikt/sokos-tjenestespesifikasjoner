//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 03:51:48 PM CET 
//


package no.rtv.namespacetss;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * DivInneholder elementene som skal være med ved spørring mot 940
 * 
 * <p>Java class for samhandlerIDataB992Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="samhandlerIDataB992Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kodeTabell" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="brukerID" type="{http://www.rtv.no/NamespaceTSS}Tbrukerid"/&gt;
 *         &lt;element name="buffnr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aksjonsKode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aksjonsKode2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kilde" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "samhandlerIDataB992Type", propOrder = {
    "kodeTabell",
    "brukerID",
    "buffnr",
    "aksjonsKode",
    "aksjonsKode2",
    "kilde"
})
public class SamhandlerIDataB992Type {

    @XmlElement(required = true)
    protected String kodeTabell;
    @XmlElement(required = true)
    protected String brukerID;
    @XmlElement(required = true)
    protected String buffnr;
    @XmlElement(required = true)
    protected String aksjonsKode;
    @XmlElement(required = true)
    protected String aksjonsKode2;
    @XmlElement(required = true)
    protected String kilde;

    /**
     * Gets the value of the kodeTabell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeTabell() {
        return kodeTabell;
    }

    /**
     * Sets the value of the kodeTabell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeTabell(String value) {
        this.kodeTabell = value;
    }

    /**
     * Gets the value of the brukerID property.
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
     */
    public void setBrukerID(String value) {
        this.brukerID = value;
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
     * Gets the value of the aksjonsKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAksjonsKode() {
        return aksjonsKode;
    }

    /**
     * Sets the value of the aksjonsKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAksjonsKode(String value) {
        this.aksjonsKode = value;
    }

    /**
     * Gets the value of the aksjonsKode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAksjonsKode2() {
        return aksjonsKode2;
    }

    /**
     * Sets the value of the aksjonsKode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAksjonsKode2(String value) {
        this.aksjonsKode2 = value;
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

}
