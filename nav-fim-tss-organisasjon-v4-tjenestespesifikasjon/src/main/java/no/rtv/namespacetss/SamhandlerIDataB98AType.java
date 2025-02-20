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
 * Inneholder elementene som skal være med ved spørring mot 985
 * 
 * <p>Java class for samhandlerIDataB98AType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="samhandlerIDataB98AType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="navnSamh" type="{http://www.rtv.no/NamespaceTSS}Tbeskr40v"/>
 *         <element name="kodeSamhType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="delNavn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="buffnr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="brukerID" type="{http://www.rtv.no/NamespaceTSS}Tbrukerid"/>
 *         <element name="aksjonsKode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="aksjonsKode2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "samhandlerIDataB98AType", propOrder = {
    "navnSamh",
    "kodeSamhType",
    "delNavn",
    "buffnr",
    "brukerID",
    "aksjonsKode",
    "aksjonsKode2"
})
public class SamhandlerIDataB98AType {

    @XmlElement(required = true)
    protected String navnSamh;
    @XmlElement(required = true)
    protected String kodeSamhType;
    @XmlElement(required = true)
    protected String delNavn;
    @XmlElement(required = true)
    protected String buffnr;
    /**
     * Dette feltet skal ikke fylles ut av en bruker i et skjermbilde.
     * 
     */
    @XmlElement(required = true)
    protected String brukerID;
    @XmlElement(required = true)
    protected String aksjonsKode;
    @XmlElement(required = true)
    protected String aksjonsKode2;

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
     * Gets the value of the delNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelNavn() {
        return delNavn;
    }

    /**
     * Sets the value of the delNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelNavn(String value) {
        this.delNavn = value;
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

}
