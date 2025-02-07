//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 03:51:48 PM CET 
//


package no.rtv.namespacetss;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Relasjon mellom to samhandlere
 * 
 * <p>Java class for typeRelAvtaler complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeRelAvtaler"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="antSamhRelasjon" type="{http://www.rtv.no/NamespaceTSS}Tantallforekomster"/&gt;
 *         &lt;element name="samhRelasjon" type="{http://www.rtv.no/NamespaceTSS}relasjonSamhType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeRelAvtaler", propOrder = {
    "antSamhRelasjon",
    "samhRelasjon"
})
public class TypeRelAvtaler {

    protected String antSamhRelasjon;
    protected List<RelasjonSamhType> samhRelasjon;

    /**
     * Gets the value of the antSamhRelasjon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntSamhRelasjon() {
        return antSamhRelasjon;
    }

    /**
     * Sets the value of the antSamhRelasjon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntSamhRelasjon(String value) {
        this.antSamhRelasjon = value;
    }

    /**
     * Gets the value of the samhRelasjon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the samhRelasjon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSamhRelasjon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelasjonSamhType }
     * 
     * 
     */
    public List<RelasjonSamhType> getSamhRelasjon() {
        if (samhRelasjon == null) {
            samhRelasjon = new ArrayList<RelasjonSamhType>();
        }
        return this.samhRelasjon;
    }

}
