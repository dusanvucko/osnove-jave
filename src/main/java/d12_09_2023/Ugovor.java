package d12_09_2023;

public class Ugovor {

    //Zadatak
    //Za potrebe agencije za nekretnine kreirati  klasu FizickoLice koje ima:
    //ime i prezime
    //broj licne karte
    //jmbg
    //podatak da li je osoba vec jednom kupovala nekretninu preko agencije (boolean)
    //konstuktore
    //gettere i settere, jmbg ne sme da se menja
    //metodu stampaj, koja stmpa podatke u formatu:
    //ime i prezime, broj licne karte
    //
    //	Kreirati klasu Ugovor koja ima:
    //godinu, dan i mesec sklapanja ugovora
    //osobu koja prodaje nekretninu (fizicko lice)
    //osobu koja kupuje nekretninu (fizicko lice)
    //cenu za koju se prodaje nekretnina
    //adresu nekretnine (ulica br., grad)
    //metodu koja vraca procenat zarade
    //za osobu koja je vec kupovale nekretninu preko agencije je 0.02 dok je za one koji nisu 0.03
    //metodu koja racuna zaradu agencije pri prodaji nekretninte koja ukljucujei poreze, takse i usluge agencije, prema formuli:
    //1000 + cena za koju se prodaje * procenat zarade
    //metodu koja stampa ugovor u formatu:
    //Dana (dan.mesec.godina.)god sklopljen je ugovor izmedju (print prodavca) i (print kupca) o kupovini nekretnine (adresa) po ceni od (cena nekretnin) pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od (zarada agencije)

    private int godinaSklapanja;
    private int danSklapanja;
    private int mesecSklapanja;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private double cena;
    private String adresaNekretnine;

    public Ugovor(int godinaSklapanja, int danSklapanja, int mesecSklapanja, FizickoLice prodavac, FizickoLice kupac, double cena, String adresaNekretnine) {
        this.godinaSklapanja = godinaSklapanja;
        this.danSklapanja = danSklapanja;
        this.mesecSklapanja = mesecSklapanja;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.cena = cena;
        this.adresaNekretnine = adresaNekretnine;
    }
    public double procenatZarade() {
        if (kupac.isKupioPrekoAgencije()) {
            return 0.02;
        } else {
            return 0.03;
        }
    }
    public double zaradaAgencije() {
        return 1000 + this.cena * this.procenatZarade();
    }
    public void stampaj() {
        System.out.println("Dana " + this.danSklapanja + "." + this.mesecSklapanja + "." + godinaSklapanja + ".god" + " sklopljen je ugovor izmedju " + this.prodavac.getPunoIme() + " i " + this.kupac.getPunoIme() + " o kupovini nekretnine " + this.adresaNekretnine + " po ceni od " + this.cena + " pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od " + this.zaradaAgencije());
    }
}
