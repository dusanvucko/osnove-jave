package p22_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        //Zadatak
        //Napisati program koji validira unos input polja za broj. Polje za unos prima samo brojeve u opsegu od 10 do 50.Korisnik unosi vrednosti dok ne unese validan  broj.
        //Primer izvrsenja:
        //Unesite broj: 5
        //Greska: Broj nije u opsegu od 10 do 50.
        //Unesite broj: -1
        //Greska: Broj nije u opsegu od 10 do 50.
        //Unesite broj: 51
        //Greska: Broj nije u opsegu od 10 do 50.
        //Unesite broj: 40
        //Broj je validan, kraj programa.

        Scanner s = new Scanner(System.in);

        int x = -1;

        while (x<10 || x>50) {
            System.out.println("Unesite broj: ");
            x=s.nextInt();

            if ( x < 10 || x > 50) {
                System.out.println("Broj " + x + " Nije u opsegu 10 do 50.");
            }

        }

            System.out.println("Broj " + x + " je validan. Kraj programa.");




    }
}
