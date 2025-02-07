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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Alternativ identifikasjon til en samhandler
 * 
 * <p>Java class for typeAltId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeAltId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="antSamhId" type="{http://www.rtv.no/NamespaceTSS}Tantallforekomster"/&gt;
 *         &lt;element name="samhId" type="{http://www.rtv.no/NamespaceTSS}samhIDType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeAltId", propOrder = {
    "antSamhId",
    "samhId"
})
public class TypeAltId {

    @XmlElement(required = true)
    protected String antSamhId;
    @XmlElement(required = true)
    protected List<SamhIDType> samhId;

    /**
     * Gets the value of the antSamhId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntSamhId() {
        return antSamhId;
    }

    /**
     * Sets the value of the antSamhId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntSamhId(String value) {
        this.antSamhId = value;
    }

    /**
     * Gets the value of the samhId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the samhId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSamhId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SamhIDType }
     * 
     * 
     */
    public List<SamhIDType> getSamhId() {
        if (samhId == null) {
            samhId = new ArrayList<SamhIDType>();
        }
        return this.samhId;
    }

}
