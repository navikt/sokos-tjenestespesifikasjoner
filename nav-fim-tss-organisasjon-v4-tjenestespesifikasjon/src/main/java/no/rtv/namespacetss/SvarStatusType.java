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
 * Dette er en type som beskriver elementer, attributer og tekst til svarstatus for data som kommer fra TSS
 * 
 * <p>Java class for svarStatusType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="svarStatusType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="alvorligGrad">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="kodeMelding">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="8"/>
 *               <whiteSpace value="collapse"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="beskrMelding">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="75"/>
 *               <whiteSpace value="collapse"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="kodeIdType" type="{http://www.rtv.no/NamespaceTSS}TkodeIdenttype" minOccurs="0"/>
 *         <element name="idOff" type="{http://www.rtv.no/NamespaceTSS}Tidoff" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "svarStatusType", propOrder = {
    "alvorligGrad",
    "kodeMelding",
    "beskrMelding",
    "kodeIdType",
    "idOff"
})
public class SvarStatusType {

    @XmlElement(required = true)
    protected String alvorligGrad;
    @XmlElement(required = true)
    protected String kodeMelding;
    @XmlElement(required = true)
    protected String beskrMelding;
    protected String kodeIdType;
    protected String idOff;

    /**
     * Gets the value of the alvorligGrad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlvorligGrad() {
        return alvorligGrad;
    }

    /**
     * Sets the value of the alvorligGrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlvorligGrad(String value) {
        this.alvorligGrad = value;
    }

    /**
     * Gets the value of the kodeMelding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeMelding() {
        return kodeMelding;
    }

    /**
     * Sets the value of the kodeMelding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeMelding(String value) {
        this.kodeMelding = value;
    }

    /**
     * Gets the value of the beskrMelding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeskrMelding() {
        return beskrMelding;
    }

    /**
     * Sets the value of the beskrMelding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeskrMelding(String value) {
        this.beskrMelding = value;
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

}
