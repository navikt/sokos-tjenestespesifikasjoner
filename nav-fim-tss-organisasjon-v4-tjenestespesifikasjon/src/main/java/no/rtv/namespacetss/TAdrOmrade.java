//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package no.rtv.namespacetss;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TAdrOmrade complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TAdrOmrade">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="typeOmrade" type="{http://www.rtv.no/NamespaceTSS}Ttypeomrade"/>
 *         <element name="omrade">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <whiteSpace value="collapse"/>
 *               <minLength value="1"/>
 *               <maxLength value="4"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="postNr">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <whiteSpace value="collapse"/>
 *               <maxLength value="4"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAdrOmrade", propOrder = {
    "typeOmrade",
    "omrade",
    "postNr"
})
public class TAdrOmrade {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Ttypeomrade typeOmrade;
    @XmlElement(required = true)
    protected String omrade;
    @XmlElement(required = true)
    protected String postNr;

    /**
     * Gets the value of the typeOmrade property.
     * 
     * @return
     *     possible object is
     *     {@link Ttypeomrade }
     *     
     */
    public Ttypeomrade getTypeOmrade() {
        return typeOmrade;
    }

    /**
     * Sets the value of the typeOmrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ttypeomrade }
     *     
     */
    public void setTypeOmrade(Ttypeomrade value) {
        this.typeOmrade = value;
    }

    /**
     * Gets the value of the omrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmrade() {
        return omrade;
    }

    /**
     * Sets the value of the omrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmrade(String value) {
        this.omrade = value;
    }

    /**
     * Gets the value of the postNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostNr() {
        return postNr;
    }

    /**
     * Sets the value of the postNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostNr(String value) {
        this.postNr = value;
    }

}
