//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package no.rtv.namespacetss;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Her beskrives returfeltene fra 930
 * 
 * <p>Java class for typeOD930 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeOD930">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="antallSamhandlere" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="enkeltSamhandler" type="{http://www.rtv.no/NamespaceTSS}typeRelasjoner" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeOD930", propOrder = {
    "antallSamhandlere",
    "enkeltSamhandler"
})
public class TypeOD930 {

    @XmlElement(required = true)
    protected String antallSamhandlere;
    protected List<TypeRelasjoner> enkeltSamhandler;

    /**
     * Gets the value of the antallSamhandlere property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntallSamhandlere() {
        return antallSamhandlere;
    }

    /**
     * Sets the value of the antallSamhandlere property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntallSamhandlere(String value) {
        this.antallSamhandlere = value;
    }

    /**
     * Gets the value of the enkeltSamhandler property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enkeltSamhandler property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEnkeltSamhandler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeRelasjoner }
     * </p>
     * 
     * 
     * @return
     *     The value of the enkeltSamhandler property.
     */
    public List<TypeRelasjoner> getEnkeltSamhandler() {
        if (enkeltSamhandler == null) {
            enkeltSamhandler = new ArrayList<>();
        }
        return this.enkeltSamhandler;
    }

}
