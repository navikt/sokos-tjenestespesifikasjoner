//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package no.nav.maskinelletrekk.trekk.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for TypeKjoring</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="TypeKjoring">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INNL"/>
 *     <enumeration value="PERI"/>
 *     <enumeration value="REME"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeKjoring")
@XmlEnum
public enum TypeKjoring {

    INNL,
    PERI,
    REME;

    public String value() {
        return name();
    }

    public static TypeKjoring fromValue(String v) {
        return valueOf(v);
    }

}
