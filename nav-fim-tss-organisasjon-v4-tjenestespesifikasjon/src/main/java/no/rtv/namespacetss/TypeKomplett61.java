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
 * Typen beskriver alle feltene i en enkelt samhandlerrelasjon.
 * 
 * <p>Java class for typeKomplett61 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeKomplett61"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.rtv.no/NamespaceTSS}typeKompSam"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="samhandler110" type="{http://www.rtv.no/NamespaceTSS}typeSamhandler"/&gt;
 *         &lt;element name="alternativId111" type="{http://www.rtv.no/NamespaceTSS}typeAltId"/&gt;
 *         &lt;element name="samhandlerFag120" type="{http://www.rtv.no/NamespaceTSS}typeSamhFag" minOccurs="0"/&gt;
 *         &lt;element name="samhandlerAvd125" type="{http://www.rtv.no/NamespaceTSS}typeSamhAvd" minOccurs="0"/&gt;
 *         &lt;element name="adresse130" type="{http://www.rtv.no/NamespaceTSS}typeSamhAdr" minOccurs="0"/&gt;
 *         &lt;element name="konto140" type="{http://www.rtv.no/NamespaceTSS}typeSamhKonto" minOccurs="0"/&gt;
 *         &lt;element name="kontakter150" type="{http://www.rtv.no/NamespaceTSS}typeSamhKontakt" minOccurs="0"/&gt;
 *         &lt;element name="autorisasjon170" type="{http://www.rtv.no/NamespaceTSS}typeAutorisasjon" minOccurs="0"/&gt;
 *         &lt;element name="rekvisisjon175" type="{http://www.rtv.no/NamespaceTSS}typeRekvisisjon" minOccurs="0"/&gt;
 *         &lt;element name="relasjoner180" type="{http://www.rtv.no/NamespaceTSS}typeRelAvtaler" minOccurs="0"/&gt;
 *         &lt;element name="avtaler190" type="{http://www.rtv.no/NamespaceTSS}typeAvtaler" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeKomplett61", propOrder = {
    "samhandler110",
    "alternativId111",
    "samhandlerFag120",
    "samhandlerAvd125",
    "adresse130",
    "konto140",
    "kontakter150",
    "autorisasjon170",
    "rekvisisjon175",
    "relasjoner180",
    "avtaler190"
})
public class TypeKomplett61
    extends TypeKompSam
{

    @XmlElement(required = true)
    protected TypeSamhandler samhandler110;
    @XmlElement(required = true)
    protected TypeAltId alternativId111;
    protected TypeSamhFag samhandlerFag120;
    protected TypeSamhAvd samhandlerAvd125;
    protected TypeSamhAdr adresse130;
    protected TypeSamhKonto konto140;
    protected TypeSamhKontakt kontakter150;
    protected TypeAutorisasjon autorisasjon170;
    protected TypeRekvisisjon rekvisisjon175;
    protected TypeRelAvtaler relasjoner180;
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
     * Gets the value of the samhandlerAvd125 property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSamhAvd }
     *     
     */
    public TypeSamhAvd getSamhandlerAvd125() {
        return samhandlerAvd125;
    }

    /**
     * Sets the value of the samhandlerAvd125 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSamhAvd }
     *     
     */
    public void setSamhandlerAvd125(TypeSamhAvd value) {
        this.samhandlerAvd125 = value;
    }

    /**
     * Gets the value of the adresse130 property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSamhAdr }
     *     
     */
    public TypeSamhAdr getAdresse130() {
        return adresse130;
    }

    /**
     * Sets the value of the adresse130 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSamhAdr }
     *     
     */
    public void setAdresse130(TypeSamhAdr value) {
        this.adresse130 = value;
    }

    /**
     * Gets the value of the konto140 property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSamhKonto }
     *     
     */
    public TypeSamhKonto getKonto140() {
        return konto140;
    }

    /**
     * Sets the value of the konto140 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSamhKonto }
     *     
     */
    public void setKonto140(TypeSamhKonto value) {
        this.konto140 = value;
    }

    /**
     * Gets the value of the kontakter150 property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSamhKontakt }
     *     
     */
    public TypeSamhKontakt getKontakter150() {
        return kontakter150;
    }

    /**
     * Sets the value of the kontakter150 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSamhKontakt }
     *     
     */
    public void setKontakter150(TypeSamhKontakt value) {
        this.kontakter150 = value;
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
     * Gets the value of the rekvisisjon175 property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRekvisisjon }
     *     
     */
    public TypeRekvisisjon getRekvisisjon175() {
        return rekvisisjon175;
    }

    /**
     * Sets the value of the rekvisisjon175 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRekvisisjon }
     *     
     */
    public void setRekvisisjon175(TypeRekvisisjon value) {
        this.rekvisisjon175 = value;
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
