
package no.nav.tjeneste.virksomhet.ytelsevedtak.v1;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.1.0
 * 2025-02-18T12:42:16.495+01:00
 * Generated source version: 4.1.0
 */

@WebFault(name = "finnYtelseVedtakListeSikkerhetsbegrensning", targetNamespace = "http://nav.no/tjeneste/virksomhet/ytelseVedtak/v1")
public class FinnYtelseVedtakListeSikkerhetsbegrensning extends Exception {

    private no.nav.tjeneste.virksomhet.ytelsevedtak.v1.feil.Sikkerhetsbegrensning faultInfo;

    public FinnYtelseVedtakListeSikkerhetsbegrensning() {
        super();
    }

    public FinnYtelseVedtakListeSikkerhetsbegrensning(String message) {
        super(message);
    }

    public FinnYtelseVedtakListeSikkerhetsbegrensning(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public FinnYtelseVedtakListeSikkerhetsbegrensning(String message, no.nav.tjeneste.virksomhet.ytelsevedtak.v1.feil.Sikkerhetsbegrensning finnYtelseVedtakListeSikkerhetsbegrensning) {
        super(message);
        this.faultInfo = finnYtelseVedtakListeSikkerhetsbegrensning;
    }

    public FinnYtelseVedtakListeSikkerhetsbegrensning(String message, no.nav.tjeneste.virksomhet.ytelsevedtak.v1.feil.Sikkerhetsbegrensning finnYtelseVedtakListeSikkerhetsbegrensning, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = finnYtelseVedtakListeSikkerhetsbegrensning;
    }

    public no.nav.tjeneste.virksomhet.ytelsevedtak.v1.feil.Sikkerhetsbegrensning getFaultInfo() {
        return this.faultInfo;
    }
}
