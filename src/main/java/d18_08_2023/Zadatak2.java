package d18_08_2023;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        //Napisati program koji simulira stampanje ocitane licne karte u vise primeraka. Korisnik unosi podatke :
        //ime
        //prezime
        //jmbg
        //broj primeraka za stampu
        //Primer izvrsenja:
        //Unesite ime: Milan
        //Unesite prezime: Jovanovic
        //Unesite jmbg: 2109238932232
        //Unesite broj primeraka za stampu: 3

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ime: ");
        String ime = s.next();

        System.out.println("Unesite prezime: ");
        String prezime = s.next();

        System.out.println("Unesite jmbg: ");
        String jmbg = s.next();

        System.out.println("Unesite broj primeraka za stampu: ");
        int brojPrimeraka = s.nextInt();

        for (int i = 0; i < brojPrimeraka; i++) {
            System.out.println("**********************");
            System.out.println(ime + " " + prezime);
            System.out.println("Jmbg:" + jmbg);
            System.out.println("**********************");

        }


    }
}
