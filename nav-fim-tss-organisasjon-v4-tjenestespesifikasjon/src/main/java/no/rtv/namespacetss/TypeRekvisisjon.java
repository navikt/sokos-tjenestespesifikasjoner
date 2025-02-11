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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Rekvisisjon til samhandler
 * 
 * <p>Java class for typeRekvisisjon complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeRekvisisjon">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence minOccurs="0">
 *         <element name="antRekInfo" type="{http://www.rtv.no/NamespaceTSS}Tantallforekomster"/>
 *         <element name="rekvisisjon" type="{http://www.rtv.no/NamespaceTSS}rekvisisjonType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeRekvisisjon", propOrder = {
    "antRekInfo",
    "rekvisisjon"
})
public class TypeRekvisisjon {

    protected String antRekInfo;
    protected List<RekvisisjonType> rekvisisjon;

    /**
     * Gets the value of the antRekInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntRekInfo() {
        return antRekInfo;
    }

    /**
     * Sets the value of the antRekInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntRekInfo(String value) {
        this.antRekInfo = value;
    }

    /**
     * Gets the value of the rekvisisjon property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rekvisisjon property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRekvisisjon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RekvisisjonType }
     * </p>
     * 
     * 
     * @return
     *     The value of the rekvisisjon property.
     */
    public List<RekvisisjonType> getRekvisisjon() {
        if (rekvisisjon == null) {
            rekvisisjon = new ArrayList<>();
        }
        return this.rekvisisjon;
    }

}
