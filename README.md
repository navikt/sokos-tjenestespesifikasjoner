# sokos-tjenestespesifikasjoner

### Bakgrunn

Dette prosjektet erstatter behovet for PO-Utbetaling av https://github.com/navikt/tjenestespesifikasjoner, som fortsatt bruker `javax` i stedet for `jakarta`.
Prosjektet benytter `LocalDate` i stedet for `XMLGregorianCalendar`

Man må generere filer lokalt, dette gjøres for å kunne følge med på endringer som gjøres i java objektene som blir generert.

## Generer nye filer lokalt

Når du genererer nye filer, slettes alt under `*/src/main/java`, og nye filer genereres. Følg disse trinnene for å generere filene:

```bash
mvn clean install -Pclear-and-generate
```

