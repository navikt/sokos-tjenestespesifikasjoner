//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 03:51:48 PM CET 
//


package no.rtv.namespacetss;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ttypeomrade.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Ttypeomrade"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;length value="1"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="K"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Ttypeomrade")
@XmlEnum
public enum Ttypeomrade {

    R,
    F,
    K;

    public String value() {
        return name();
    }

    public static Ttypeomrade fromValue(String v) {
        return valueOf(v);
    }

}
