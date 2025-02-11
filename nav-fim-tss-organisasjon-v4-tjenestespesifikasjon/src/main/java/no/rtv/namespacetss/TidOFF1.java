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
 * <p>Java class for TidOFF1 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TidOFF1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="idOff" type="{http://www.rtv.no/NamespaceTSS}Tidoff"/>
 *         <element name="kodeIdType" type="{http://www.rtv.no/NamespaceTSS}TkodeIdenttype"/>
 *         <element name="kodeSamhType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="avdelingsNr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="offNrAvd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TidOFF1", propOrder = {
    "idOff",
    "kodeIdType",
    "kodeSamhType",
    "avdelingsNr",
    "offNrAvd"
})
public class TidOFF1 {

    @XmlElement(required = true)
    protected String idOff;
    @XmlElement(required = true)
    protected String kodeIdType;
    @XmlElement(required = true)
    protected String kodeSamhType;
    @XmlElement(required = true)
    protected String avdelingsNr;
    @XmlElement(required = true)
    protected String offNrAvd;

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
     * Gets the value of the avdelingsNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvdelingsNr() {
        return avdelingsNr;
    }

    /**
     * Sets the value of the avdelingsNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvdelingsNr(String value) {
        this.avdelingsNr = value;
    }

    /**
     * Gets the value of the offNrAvd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffNrAvd() {
        return offNrAvd;
    }

    /**
     * Sets the value of the offNrAvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffNrAvd(String value) {
        this.offNrAvd = value;
    }

}
