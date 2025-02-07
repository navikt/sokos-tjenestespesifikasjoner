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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Her beskrives returfeltene fra 970
 * 
 * <p>Java class for typeOD970 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeOD970"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="samhandler110" type="{http://www.rtv.no/NamespaceTSS}typeSamhandler"/&gt;
 *         &lt;element name="alternativId111" type="{http://www.rtv.no/NamespaceTSS}typeAltId"/&gt;
 *         &lt;element name="samhandlerFag120" type="{http://www.rtv.no/NamespaceTSS}typeSamhFag"/&gt;
 *         &lt;element name="autorisasjon170" type="{http://www.rtv.no/NamespaceTSS}typeAutorisasjon"/&gt;
 *         &lt;element name="relasjoner180" type="{http://www.rtv.no/NamespaceTSS}typeRelAvtaler"/&gt;
 *         &lt;element name="avtaler190" type="{http://www.rtv.no/NamespaceTSS}typeAvtaler"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeOD970", propOrder = {
    "samhandler110",
    "alternativId111",
    "samhandlerFag120",
    "autorisasjon170",
    "relasjoner180",
    "avtaler190"
})
@XmlSeeAlso({
    no.rtv.namespacetss.TssSamhandlerData.TssOutputDataAsyn.SamhandlerODataB970 .class
})
public class TypeOD970 {

    @XmlElement(required = true)
    protected TypeSamhandler samhandler110;
    @XmlElement(required = true)
    protected TypeAltId alternativId111;
    @XmlElement(required = true)
    protected TypeSamhFag samhandlerFag120;
    @XmlElement(required = true)
    protected TypeAutorisasjon autorisasjon170;
    @XmlElement(required = true)
    protected TypeRelAvtaler relasjoner180;
    @XmlElement(required = true)
    protected TypeAvtaler avtaler190;

    /**
     * Gets the value of the samhandler110 property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSamhandler }
     *     
     */
    public TypeSamhandler getSamhandler110() {
        return samhandler110;
    }

    /**
     * Sets the value of the samhandler110 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSamhandler }
     *     
     */
    public void setSamhandler110(TypeSamhandler value) {
        this.samhandler110 = value;
    }

    /**
     * Gets the value of the alternativId111 property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAltId }
     *     
     */
    public TypeAltId getAlternativId111() {
        return alternativId111;
    }

    /**
     * Sets the value of the alternativId111 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAltId }
     *     
     */
    public void setAlternativId111(TypeAltId value) {
        this.alternativId111 = value;
    }

    /**
     * Gets the value of the samhandlerFag120 property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSamhFag }
     *     
     */
    public TypeSamhFag getSamhandlerFag120() {
        return samhandlerFag120;
    }

    /**
     * Sets the value of the samhandlerFag120 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSamhFag }
     *     
     */
    public void setSamhandlerFag120(TypeSamhFag value) {
        this.samhandlerFag120 = value;
    }

    /**
     * Gets the value of the autorisasjon170 property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAutorisasjon }
     *     
     */
    public TypeAutorisasjon getAutorisasjon170() {
        return autorisasjon170;
    }

    /**
     * Sets the value of the autorisasjon170 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAutorisasjon }
     *     
     */
    public void setAutorisasjon170(TypeAutorisasjon value) {
        this.autorisasjon170 = value;
    }

    /**
     * Gets the value of the relasjoner180 property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRelAvtaler }
     *     
     */
    public TypeRelAvtaler getRelasjoner180() {
        return relasjoner180;
    }

    /**
     * Sets the value of the relasjoner180 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRelAvtaler }
     *     
     */
    public void setRelasjoner180(TypeRelAvtaler value) {
        this.relasjoner180 = value;
    }

    /**
     * Gets the value of the avtaler190 property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAvtaler }
     *     
     */
    public TypeAvtaler getAvtaler190() {
        return avtaler190;
    }

    /**
     * Sets the value of the avtaler190 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAvtaler }
     *     
     */
    public void setAvtaler190(TypeAvtaler value) {
        this.avtaler190 = value;
    }

}
