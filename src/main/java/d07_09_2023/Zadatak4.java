package d07_09_2023;

public class Zadatak4 {
    public static void main(String[] args) {

        // Zadatak 4: Kreiranje klase "Film"
        //Napišite klasu "Film" sa atributima: naslov (String), godinaIzdanja (int) i reziser (String).
        // U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti unosom sa tastature. Ispisati informacije o filmovima.

        Film a = new Film();
        a.naslov = "Pulp fiction";
        a.godinaIzdanja = 1994;
        a.reziser = "Quentin Tarantino";

        Film b = new Film();
        b.naslov = "Once upon a time in Hollywood";
        b.godinaIzdanja = 2019;
        b.reziser = "Quentin Tarantino";

        System.out.println("FIlm: " + a.naslov + " iz godine: " + a.godinaIzdanja + ", rezirao je: " + a.reziser);
        System.out.println("FIlm: " + b.naslov + " iz godine: " + b.godinaIzdanja + ", rezirao je: " + b.reziser);


    }
}
