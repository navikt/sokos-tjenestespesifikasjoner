//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package no.nav.maskinelletrekk.trekk.v1;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrekkRequest complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TrekkRequest">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="offnr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="trekkvedtakId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="trekkalt" type="{urn:no:nav:maskinelletrekk:trekk:v1}Trekkalternativ"/>
 *         <element name="system" type="{urn:no:nav:maskinelletrekk:trekk:v1}System" minOccurs="0"/>
 *         <element name="trekkSats" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="totalSatsOS" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrekkRequest", propOrder = {
    "offnr",
    "trekkvedtakId",
    "trekkalt",
    "system",
    "trekkSats",
    "totalSatsOS"
})
public class TrekkRequest {

    @XmlElement(required = true)
    protected String offnr;
    protected int trekkvedtakId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Trekkalternativ trekkalt;
    @XmlSchemaType(name = "string")
    protected System system;
    @XmlElement(required = true)
    protected BigDecimal trekkSats;
    @XmlElement(required = true)
    protected BigDecimal totalSatsOS;

    /**
     * Gets the value of the offnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffnr() {
        return offnr;
    }

    /**
     * Sets the value of the offnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffnr(String value) {
        this.offnr = value;
    }

    /**
     * Gets the value of the trekkvedtakId property.
     * 
     */
    public int getTrekkvedtakId() {
        return trekkvedtakId;
    }

    /**
     * Sets the value of the trekkvedtakId property.
     * 
     */
    public void setTrekkvedtakId(int value) {
        this.trekkvedtakId = value;
    }

    /**
     * Gets the value of the trekkalt property.
     * 
     * @return
     *     possible object is
     *     {@link Trekkalternativ }
     *     
     */
    public Trekkalternativ getTrekkalt() {
        return trekkalt;
    }

    /**
     * Sets the value of the trekkalt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trekkalternativ }
     *     
     */
    public void setTrekkalt(Trekkalternativ value) {
        this.trekkalt = value;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link System }
     *     
     */
    public System getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link System }
     *     
     */
    public void setSystem(System value) {
        this.system = value;
    }

    /**
     * Gets the value of the trekkSats property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrekkSats() {
        return trekkSats;
    }

    /**
     * Sets the value of the trekkSats property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrekkSats(BigDecimal value) {
        this.trekkSats = value;
    }

    /**
     * Gets the value of the totalSatsOS property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSatsOS() {
        return totalSatsOS;
    }

    /**
     * Sets the value of the totalSatsOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalSatsOS(BigDecimal value) {
        this.totalSatsOS = value;
    }

}
