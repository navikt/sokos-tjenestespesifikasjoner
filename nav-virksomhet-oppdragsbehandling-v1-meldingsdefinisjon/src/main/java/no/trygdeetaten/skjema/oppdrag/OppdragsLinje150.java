//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package no.trygdeetaten.skjema.oppdrag;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Inneholder elementene som skal være med i en 150-rekord, Oppdragslinje
 * 
 * <p>Java class for oppdrags-linje-150 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="oppdrags-linje-150">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="kodeEndringLinje">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="NY"/>
 *               <enumeration value="ENDR"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="kodeStatusLinje" type="{http://www.trygdeetaten.no/skjema/oppdrag}TkodeStatusLinje" minOccurs="0"/>
 *         <element name="datoStatusFom" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tdato" minOccurs="0"/>
 *         <element name="vedtakId" type="{http://www.trygdeetaten.no/skjema/oppdrag}TvedtakId" minOccurs="0"/>
 *         <element name="delytelseId" type="{http://www.trygdeetaten.no/skjema/oppdrag}TdelytelseId" minOccurs="0"/>
 *         <element name="linjeId" type="{http://www.trygdeetaten.no/skjema/oppdrag}TlinjeId" minOccurs="0"/>
 *         <element name="kodeKlassifik" type="{http://www.trygdeetaten.no/skjema/oppdrag}TkodeKlassifik"/>
 *         <element name="datoKlassifikFom" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tdato" minOccurs="0"/>
 *         <element name="datoVedtakFom" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tdato"/>
 *         <element name="datoVedtakTom" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tdato" minOccurs="0"/>
 *         <element name="sats" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tsats"/>
 *         <element name="fradragTillegg" type="{http://www.trygdeetaten.no/skjema/oppdrag}TfradragTillegg"/>
 *         <element name="typeSats" type="{http://www.trygdeetaten.no/skjema/oppdrag}TtypeSats"/>
 *         <element name="skyldnerId" type="{http://www.trygdeetaten.no/skjema/oppdrag}TfnrOrgnr" minOccurs="0"/>
 *         <element name="datoSkyldnerFom" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tdato" minOccurs="0"/>
 *         <element name="kravhaverId" type="{http://www.trygdeetaten.no/skjema/oppdrag}TfnrOrgnr" minOccurs="0"/>
 *         <element name="datoKravhaverFom" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tdato" minOccurs="0"/>
 *         <element name="kid" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tkid" minOccurs="0"/>
 *         <element name="datoKidFom" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tdato" minOccurs="0"/>
 *         <element name="brukKjoreplan" type="{http://www.trygdeetaten.no/skjema/oppdrag}TbrukKjoreplan" minOccurs="0"/>
 *         <element name="saksbehId" type="{http://www.trygdeetaten.no/skjema/oppdrag}TsaksbehId"/>
 *         <element name="utbetalesTilId" type="{http://www.trygdeetaten.no/skjema/oppdrag}TfnrOrgnr" minOccurs="0"/>
 *         <element name="datoUtbetalesTilIdFom" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tdato" minOccurs="0"/>
 *         <element name="kodeArbeidsgiver" type="{http://www.trygdeetaten.no/skjema/oppdrag}TkodeArbeidsgiver" minOccurs="0"/>
 *         <element name="henvisning" type="{http://www.trygdeetaten.no/skjema/oppdrag}Thenvisning" minOccurs="0"/>
 *         <element name="typeSoknad" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="10"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="refFagsystemId" type="{http://www.trygdeetaten.no/skjema/oppdrag}TfagsystemId" minOccurs="0"/>
 *         <element name="refOppdragsId" type="{http://www.trygdeetaten.no/skjema/oppdrag}ToppdragsId" minOccurs="0"/>
 *         <element name="refDelytelseId" type="{http://www.trygdeetaten.no/skjema/oppdrag}TdelytelseId" minOccurs="0"/>
 *         <element name="refLinjeId" type="{http://www.trygdeetaten.no/skjema/oppdrag}TlinjeId" minOccurs="0"/>
 *         <element name="linje-status-151" type="{http://www.trygdeetaten.no/skjema/oppdrag}linje-status-151" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="klassifikasjon-152" type="{http://www.trygdeetaten.no/skjema/oppdrag}klassifikasjon-152" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="skyldner-153" type="{http://www.trygdeetaten.no/skjema/oppdrag}skyldner-153" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="kid-154" type="{http://www.trygdeetaten.no/skjema/oppdrag}kid-154" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="utbetales-til-155" type="{http://www.trygdeetaten.no/skjema/oppdrag}utbetales-til-155" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="refusjonsinfo-156" type="{http://www.trygdeetaten.no/skjema/oppdrag}refusjonsinfo-156" minOccurs="0"/>
 *         <element name="vedtakssats-157" type="{http://www.trygdeetaten.no/skjema/oppdrag}vedtakssats-157" minOccurs="0"/>
 *         <element name="linje-tekst-158" type="{http://www.trygdeetaten.no/skjema/oppdrag}linje-tekst-158" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="linje-enhet-160" type="{http://www.trygdeetaten.no/skjema/oppdrag}linje-enhet-160" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="grad-170" type="{http://www.trygdeetaten.no/skjema/oppdrag}grad-170" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="attestant-180" type="{http://www.trygdeetaten.no/skjema/oppdrag}attestant-180" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="valuta-190" type="{http://www.trygdeetaten.no/skjema/oppdrag}valuta-190" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oppdrags-linje-150", propOrder = {
    "kodeEndringLinje",
    "kodeStatusLinje",
    "datoStatusFom",
    "vedtakId",
    "delytelseId",
    "linjeId",
    "kodeKlassifik",
    "datoKlassifikFom",
    "datoVedtakFom",
    "datoVedtakTom",
    "sats",
    "fradragTillegg",
    "typeSats",
    "skyldnerId",
    "datoSkyldnerFom",
    "kravhaverId",
    "datoKravhaverFom",
    "kid",
    "datoKidFom",
    "brukKjoreplan",
    "saksbehId",
    "utbetalesTilId",
    "datoUtbetalesTilIdFom",
    "kodeArbeidsgiver",
    "henvisning",
    "typeSoknad",
    "refFagsystemId",
    "refOppdragsId",
    "refDelytelseId",
    "refLinjeId",
    "linjeStatus151",
    "klassifikasjon152",
    "skyldner153",
    "kid154",
    "utbetalesTil155",
    "refusjonsinfo156",
    "vedtakssats157",
    "linjeTekst158",
    "linjeEnhet160",
    "grad170",
    "attestant180",
    "valuta190"
})
public class OppdragsLinje150 {

    @XmlElement(required = true)
    protected String kodeEndringLinje;
    @XmlSchemaType(name = "string")
    protected TkodeStatusLinje kodeStatusLinje;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoStatusFom;
    protected String vedtakId;
    protected String delytelseId;
    protected BigInteger linjeId;
    @XmlElement(required = true)
    protected String kodeKlassifik;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoKlassifikFom;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoVedtakFom;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoVedtakTom;
    @XmlElement(required = true)
    protected BigDecimal sats;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TfradragTillegg fradragTillegg;
    @XmlElement(required = true)
    protected String typeSats;
    protected String skyldnerId;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoSkyldnerFom;
    protected String kravhaverId;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoKravhaverFom;
    protected String kid;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoKidFom;
    protected String brukKjoreplan;
    @XmlElement(required = true)
    protected String saksbehId;
    protected String utbetalesTilId;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoUtbetalesTilIdFom;
    @XmlSchemaType(name = "string")
    protected TkodeArbeidsgiver kodeArbeidsgiver;
    protected String henvisning;
    protected String typeSoknad;
    protected String refFagsystemId;
    protected Long refOppdragsId;
    protected String refDelytelseId;
    protected BigInteger refLinjeId;
    @XmlElement(name = "linje-status-151")
    protected List<LinjeStatus151> linjeStatus151;
    @XmlElement(name = "klassifikasjon-152")
    protected List<Klassifikasjon152> klassifikasjon152;
    @XmlElement(name = "skyldner-153")
    protected List<Skyldner153> skyldner153;
    @XmlElement(name = "kid-154")
    protected List<Kid154> kid154;
    @XmlElement(name = "utbetales-til-155")
    protected List<UtbetalesTil155> utbetalesTil155;
    @XmlElement(name = "refusjonsinfo-156")
    protected Refusjonsinfo156 refusjonsinfo156;
    @XmlElement(name = "vedtakssats-157")
    protected Vedtakssats157 vedtakssats157;
    @XmlElement(name = "linje-tekst-158")
    protected List<LinjeTekst158> linjeTekst158;
    @XmlElement(name = "linje-enhet-160")
    protected List<LinjeEnhet160> linjeEnhet160;
    @XmlElement(name = "grad-170")
    protected List<Grad170> grad170;
    @XmlElement(name = "attestant-180")
    protected List<Attestant180> attestant180;
    @XmlElement(name = "valuta-190")
    protected List<Valuta190> valuta190;

    /**
     * Gets the value of the kodeEndringLinje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeEndringLinje() {
        return kodeEndringLinje;
    }

    /**
     * Sets the value of the kodeEndringLinje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeEndringLinje(String value) {
        this.kodeEndringLinje = value;
    }

    /**
     * Gets the value of the kodeStatusLinje property.
     * 
     * @return
     *     possible object is
     *     {@link TkodeStatusLinje }
     *     
     */
    public TkodeStatusLinje getKodeStatusLinje() {
        return kodeStatusLinje;
    }

    /**
     * Sets the value of the kodeStatusLinje property.
     * 
     * @param value
     *     allowed object is
     *     {@link TkodeStatusLinje }
     *     
     */
    public void setKodeStatusLinje(TkodeStatusLinje value) {
        this.kodeStatusLinje = value;
    }

    /**
     * Gets the value of the datoStatusFom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoStatusFom() {
        return datoStatusFom;
    }

    /**
     * Sets the value of the datoStatusFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoStatusFom(XMLGregorianCalendar value) {
        this.datoStatusFom = value;
    }

    /**
     * Gets the value of the vedtakId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVedtakId() {
        return vedtakId;
    }

    /**
     * Sets the value of the vedtakId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVedtakId(String value) {
        this.vedtakId = value;
    }

    /**
     * Gets the value of the delytelseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelytelseId() {
        return delytelseId;
    }

    /**
     * Sets the value of the delytelseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelytelseId(String value) {
        this.delytelseId = value;
    }

    /**
     * Gets the value of the linjeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLinjeId() {
        return linjeId;
    }

    /**
     * Sets the value of the linjeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLinjeId(BigInteger value) {
        this.linjeId = value;
    }

    /**
     * Gets the value of the kodeKlassifik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeKlassifik() {
        return kodeKlassifik;
    }

    /**
     * Sets the value of the kodeKlassifik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeKlassifik(String value) {
        this.kodeKlassifik = value;
    }

    /**
     * Gets the value of the datoKlassifikFom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoKlassifikFom() {
        return datoKlassifikFom;
    }

    /**
     * Sets the value of the datoKlassifikFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoKlassifikFom(XMLGregorianCalendar value) {
        this.datoKlassifikFom = value;
    }

    /**
     * Gets the value of the datoVedtakFom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoVedtakFom() {
        return datoVedtakFom;
    }

    /**
     * Sets the value of the datoVedtakFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoVedtakFom(XMLGregorianCalendar value) {
        this.datoVedtakFom = value;
    }

    /**
     * Gets the value of the datoVedtakTom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoVedtakTom() {
        return datoVedtakTom;
    }

    /**
     * Sets the value of the datoVedtakTom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoVedtakTom(XMLGregorianCalendar value) {
        this.datoVedtakTom = value;
    }

    /**
     * Gets the value of the sats property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSats() {
        return sats;
    }

    /**
     * Sets the value of the sats property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSats(BigDecimal value) {
        this.sats = value;
    }

    /**
     * Gets the value of the fradragTillegg property.
     * 
     * @return
     *     possible object is
     *     {@link TfradragTillegg }
     *     
     */
    public TfradragTillegg getFradragTillegg() {
        return fradragTillegg;
    }

    /**
     * Sets the value of the fradragTillegg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TfradragTillegg }
     *     
     */
    public void setFradragTillegg(TfradragTillegg value) {
        this.fradragTillegg = value;
    }

    /**
     * Gets the value of the typeSats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeSats() {
        return typeSats;
    }

    /**
     * Sets the value of the typeSats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeSats(String value) {
        this.typeSats = value;
    }

    /**
     * Gets the value of the skyldnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkyldnerId() {
        return skyldnerId;
    }

    /**
     * Sets the value of the skyldnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkyldnerId(String value) {
        this.skyldnerId = value;
    }

    /**
     * Gets the value of the datoSkyldnerFom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoSkyldnerFom() {
        return datoSkyldnerFom;
    }

    /**
     * Sets the value of the datoSkyldnerFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoSkyldnerFom(XMLGregorianCalendar value) {
        this.datoSkyldnerFom = value;
    }

    /**
     * Gets the value of the kravhaverId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKravhaverId() {
        return kravhaverId;
    }

    /**
     * Sets the value of the kravhaverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKravhaverId(String value) {
        this.kravhaverId = value;
    }

    /**
     * Gets the value of the datoKravhaverFom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoKravhaverFom() {
        return datoKravhaverFom;
    }

    /**
     * Sets the value of the datoKravhaverFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoKravhaverFom(XMLGregorianCalendar value) {
        this.datoKravhaverFom = value;
    }

    /**
     * Gets the value of the kid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKid() {
        return kid;
    }

    /**
     * Sets the value of the kid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKid(String value) {
        this.kid = value;
    }

    /**
     * Gets the value of the datoKidFom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoKidFom() {
        return datoKidFom;
    }

    /**
     * Sets the value of the datoKidFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoKidFom(XMLGregorianCalendar value) {
        this.datoKidFom = value;
    }

    /**
     * Gets the value of the brukKjoreplan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrukKjoreplan() {
        return brukKjoreplan;
    }

    /**
     * Sets the value of the brukKjoreplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrukKjoreplan(String value) {
        this.brukKjoreplan = value;
    }

    /**
     * Gets the value of the saksbehId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaksbehId() {
        return saksbehId;
    }

    /**
     * Sets the value of the saksbehId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaksbehId(String value) {
        this.saksbehId = value;
    }

    /**
     * Gets the value of the utbetalesTilId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtbetalesTilId() {
        return utbetalesTilId;
    }

    /**
     * Sets the value of the utbetalesTilId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtbetalesTilId(String value) {
        this.utbetalesTilId = value;
    }

    /**
     * Gets the value of the datoUtbetalesTilIdFom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoUtbetalesTilIdFom() {
        return datoUtbetalesTilIdFom;
    }

    /**
     * Sets the value of the datoUtbetalesTilIdFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoUtbetalesTilIdFom(XMLGregorianCalendar value) {
        this.datoUtbetalesTilIdFom = value;
    }

    /**
     * Gets the value of the kodeArbeidsgiver property.
     * 
     * @return
     *     possible object is
     *     {@link TkodeArbeidsgiver }
     *     
     */
    public TkodeArbeidsgiver getKodeArbeidsgiver() {
        return kodeArbeidsgiver;
    }

    /**
     * Sets the value of the kodeArbeidsgiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link TkodeArbeidsgiver }
     *     
     */
    public void setKodeArbeidsgiver(TkodeArbeidsgiver value) {
        this.kodeArbeidsgiver = value;
    }

    /**
     * Gets the value of the henvisning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHenvisning() {
        return henvisning;
    }

    /**
     * Sets the value of the henvisning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHenvisning(String value) {
        this.henvisning = value;
    }

    /**
     * Gets the value of the typeSoknad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeSoknad() {
        return typeSoknad;
    }

    /**
     * Sets the value of the typeSoknad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeSoknad(String value) {
        this.typeSoknad = value;
    }

    /**
     * Gets the value of the refFagsystemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefFagsystemId() {
        return refFagsystemId;
    }

    /**
     * Sets the value of the refFagsystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefFagsystemId(String value) {
        this.refFagsystemId = value;
    }

    /**
     * Gets the value of the refOppdragsId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRefOppdragsId() {
        return refOppdragsId;
    }

    /**
     * Sets the value of the refOppdragsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRefOppdragsId(Long value) {
        this.refOppdragsId = value;
    }

    /**
     * Gets the value of the refDelytelseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDelytelseId() {
        return refDelytelseId;
    }

    /**
     * Sets the value of the refDelytelseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDelytelseId(String value) {
        this.refDelytelseId = value;
    }

    /**
     * Gets the value of the refLinjeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRefLinjeId() {
        return refLinjeId;
    }

    /**
     * Sets the value of the refLinjeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRefLinjeId(BigInteger value) {
        this.refLinjeId = value;
    }

    /**
     * Gets the value of the linjeStatus151 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linjeStatus151 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLinjeStatus151().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinjeStatus151 }
     * </p>
     * 
     * 
     * @return
     *     The value of the linjeStatus151 property.
     */
    public List<LinjeStatus151> getLinjeStatus151() {
        if (linjeStatus151 == null) {
            linjeStatus151 = new ArrayList<>();
        }
        return this.linjeStatus151;
    }

    /**
     * Gets the value of the klassifikasjon152 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the klassifikasjon152 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getKlassifikasjon152().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Klassifikasjon152 }
     * </p>
     * 
     * 
     * @return
     *     The value of the klassifikasjon152 property.
     */
    public List<Klassifikasjon152> getKlassifikasjon152() {
        if (klassifikasjon152 == null) {
            klassifikasjon152 = new ArrayList<>();
        }
        return this.klassifikasjon152;
    }

    /**
     * Gets the value of the skyldner153 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skyldner153 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSkyldner153().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Skyldner153 }
     * </p>
     * 
     * 
     * @return
     *     The value of the skyldner153 property.
     */
    public List<Skyldner153> getSkyldner153() {
        if (skyldner153 == null) {
            skyldner153 = new ArrayList<>();
        }
        return this.skyldner153;
    }

    /**
     * Gets the value of the kid154 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kid154 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getKid154().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Kid154 }
     * </p>
     * 
     * 
     * @return
     *     The value of the kid154 property.
     */
    public List<Kid154> getKid154() {
        if (kid154 == null) {
            kid154 = new ArrayList<>();
        }
        return this.kid154;
    }

    /**
     * Gets the value of the utbetalesTil155 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the utbetalesTil155 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUtbetalesTil155().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UtbetalesTil155 }
     * </p>
     * 
     * 
     * @return
     *     The value of the utbetalesTil155 property.
     */
    public List<UtbetalesTil155> getUtbetalesTil155() {
        if (utbetalesTil155 == null) {
            utbetalesTil155 = new ArrayList<>();
        }
        return this.utbetalesTil155;
    }

    /**
     * Gets the value of the refusjonsinfo156 property.
     * 
     * @return
     *     possible object is
     *     {@link Refusjonsinfo156 }
     *     
     */
    public Refusjonsinfo156 getRefusjonsinfo156() {
        return refusjonsinfo156;
    }

    /**
     * Sets the value of the refusjonsinfo156 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Refusjonsinfo156 }
     *     
     */
    public void setRefusjonsinfo156(Refusjonsinfo156 value) {
        this.refusjonsinfo156 = value;
    }

    /**
     * Gets the value of the vedtakssats157 property.
     * 
     * @return
     *     possible object is
     *     {@link Vedtakssats157 }
     *     
     */
    public Vedtakssats157 getVedtakssats157() {
        return vedtakssats157;
    }

    /**
     * Sets the value of the vedtakssats157 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vedtakssats157 }
     *     
     */
    public void setVedtakssats157(Vedtakssats157 value) {
        this.vedtakssats157 = value;
    }

    /**
     * Gets the value of the linjeTekst158 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linjeTekst158 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLinjeTekst158().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinjeTekst158 }
     * </p>
     * 
     * 
     * @return
     *     The value of the linjeTekst158 property.
     */
    public List<LinjeTekst158> getLinjeTekst158() {
        if (linjeTekst158 == null) {
            linjeTekst158 = new ArrayList<>();
        }
        return this.linjeTekst158;
    }

    /**
     * Gets the value of the linjeEnhet160 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linjeEnhet160 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLinjeEnhet160().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinjeEnhet160 }
     * </p>
     * 
     * 
     * @return
     *     The value of the linjeEnhet160 property.
     */
    public List<LinjeEnhet160> getLinjeEnhet160() {
        if (linjeEnhet160 == null) {
            linjeEnhet160 = new ArrayList<>();
        }
        return this.linjeEnhet160;
    }

    /**
     * Gets the value of the grad170 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grad170 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGrad170().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Grad170 }
     * </p>
     * 
     * 
     * @return
     *     The value of the grad170 property.
     */
    public List<Grad170> getGrad170() {
        if (grad170 == null) {
            grad170 = new ArrayList<>();
        }
        return this.grad170;
    }

    /**
     * Gets the value of the attestant180 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attestant180 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttestant180().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attestant180 }
     * </p>
     * 
     * 
     * @return
     *     The value of the attestant180 property.
     */
    public List<Attestant180> getAttestant180() {
        if (attestant180 == null) {
            attestant180 = new ArrayList<>();
        }
        return this.attestant180;
    }

    /**
     * Gets the value of the valuta190 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valuta190 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getValuta190().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Valuta190 }
     * </p>
     * 
     * 
     * @return
     *     The value of the valuta190 property.
     */
    public List<Valuta190> getValuta190() {
        if (valuta190 == null) {
            valuta190 = new ArrayList<>();
        }
        return this.valuta190;
    }

}
