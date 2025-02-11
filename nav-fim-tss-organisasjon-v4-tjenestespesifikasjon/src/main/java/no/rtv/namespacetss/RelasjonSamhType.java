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
 * Dette er en type som beskriver elementene til samhandler adresse data
 * 
 * <p>Java class for relasjonSamhType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="relasjonSamhType">
 *   <complexContent>
 *     <extension base="{http://www.rtv.no/NamespaceTSS}samhRelasjonType">
 *       <sequence>
 *         <element name="antRelSamh" type="{http://www.rtv.no/NamespaceTSS}Tantallforekomster"/>
 *         <element name="relSamhandler" type="{http://www.rtv.no/NamespaceTSS}relSamhType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relasjonSamhType", propOrder = {
    "antRelSamh",
    "relSamhandler"
})
public class RelasjonSamhType
    extends SamhRelasjonType
{

    @XmlElement(required = true)
    protected String antRelSamh;
    protected List<RelSamhType> relSamhandler;

    /**
     * Gets the value of the antRelSamh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntRelSamh() {
        return antRelSamh;
    }

    /**
     * Sets the value of the antRelSamh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntRelSamh(String value) {
        this.antRelSamh = value;
    }

    /**
     * Gets the value of the relSamhandler property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relSamhandler property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRelSamhandler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelSamhType }
     * </p>
     * 
     * 
     * @return
     *     The value of the relSamhandler property.
     */
    public List<RelSamhType> getRelSamhandler() {
        if (relSamhandler == null) {
            relSamhandler = new ArrayList<>();
        }
        return this.relSamhandler;
    }

}
