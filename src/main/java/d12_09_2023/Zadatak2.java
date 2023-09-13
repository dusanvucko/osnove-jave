package d12_09_2023;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {

//         //Zadatak
//    //Kreirati klasu ZeleniKarton koja ima:
//    //ime i prezime studenta
//    //broj indeksa
//    //naziv predmeta
//    //ime i prezime profesora
//    //ocenu - od 5 do 10
//    //gettere i settere
//    //konstruktore
//    //metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//    //metodu stampaj koja stampa podatke u formatu:
//    //		(naziv predmeta) - (ocena)
//    //		Student: ime i prezime, broj indeksa
//    //		Profesor: ime i prezime
//    //
//    //	U glavnoj klasi:
//    //kreirati niz od 5 zelenih kartona za ispite i odstampati podatke za sve ispite
//    //Zatim program pronalazi i ispisuje prosecnu ocenu za sve ispite

        ArrayList<ZeleniKarton> zeleniKartoni = new ArrayList<>();

        zeleniKartoni.add(new ZeleniKarton("Dusan Vuckovic", "25039", "Matematika1", "Milan Jovanovic", 6));
        zeleniKartoni.add(new ZeleniKarton("Milan Jovanovic", "62500", "Fizika1", "Vladimir Jovanovic", 7));
        zeleniKartoni.add(new ZeleniKarton("Vladimir Minic", "32561", "Psihologija", "Dusan Dusanovic", 6));
        zeleniKartoni.add(new ZeleniKarton("Vuk Vucic", "45678", "Informatika", "Darko Darkovic", 10));
        zeleniKartoni.add(new ZeleniKarton("Zlatko Zlatic", "56789", "Matematika2", "Pera Peric", 5));

        for (int i = 0; i < zeleniKartoni.size(); i++) {
            ZeleniKarton zeleniKarton = zeleniKartoni.get(i);
            zeleniKarton.stampaj();
            System.out.println("Ispit polozen: " + zeleniKarton.jeIspitPolozen());
            System.out.println();
        }

        int ukupnaOcenaPolozeni = 0;
        int brojPolozenihIspita = 0;
        for (int i = 0; i < zeleniKartoni.size(); i++) {
            ZeleniKarton zeleniKarton = zeleniKartoni.get(i);
            if (zeleniKarton.jeIspitPolozen()) {
                ukupnaOcenaPolozeni += zeleniKarton.getOcena();
                brojPolozenihIspita++;
            }
        }
        double prosecnaOcenaPolozeni;
        if (brojPolozenihIspita > 0) {
            prosecnaOcenaPolozeni = (double) ukupnaOcenaPolozeni / brojPolozenihIspita;
        } else {
            prosecnaOcenaPolozeni = 0.0;
        }
        System.out.println("Prosecna ocena za polozene ispite: " + prosecnaOcenaPolozeni);
    }
}

