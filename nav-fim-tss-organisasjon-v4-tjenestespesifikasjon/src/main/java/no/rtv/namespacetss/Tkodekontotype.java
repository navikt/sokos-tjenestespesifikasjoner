//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package no.rtv.namespacetss;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Typen beskriver formatet/begrensninene til elementer som handler om kontortype koder
 * 
 * <p>Java class for Tkodekontotype</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Tkodekontotype">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <length value="4"/>
 *     <enumeration value="BANK"/>
 *     <enumeration value="SJKK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Tkodekontotype")
@XmlEnum
public enum Tkodekontotype {

    BANK,
    SJKK;

    public String value() {
        return name();
    }

    public static Tkodekontotype fromValue(String v) {
        return valueOf(v);
    }

}
