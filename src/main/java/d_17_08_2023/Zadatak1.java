package d_17_08_2023;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        //Napisati program koji ima informacije koje ucitava informacije sa tastature:
        //Ime
        //Prezime
        //godinu rodjenja
        //I stampa informaicije u formatu:
        //[ime] [prezime] - [startost] god

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite vase ime: ");
        String ime = s.next();

        System.out.println("Unesite vase prezime: ");
        String prezime = s.next();

        System.out.println("Unesite vasu godinu rodjenja: ");
        int godinaRodjenja = s.nextInt();

        int trenutnaGodina = 2023;

        System.out.println(ime + " " + prezime + " " + (trenutnaGodina - godinaRodjenja) + " " + "god");
    }
}
