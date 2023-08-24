package p22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//        Zadatak
//        Napisati program koji od korisnika ucitava brojeve sve dok ne unesu makar po jedan broj od 1 do 4.
//        Primer:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:2
//        Unesite broj:3
//        Unesite broj:0
//        Unesite broj:5
//        Unesite broj:3
//        Unesite broj:4
//        Kraj programa
//
//        Objasnjenje: Od svakih 1, 2, 3 i 4 je unet po jedan.

        Scanner s = new Scanner(System.in);

        int broj = 0;
        int jedan = 0;
        int dva = 0;
        int tri = 0;
        int cetiri = 0;
        boolean limit = false;

        while (!limit) {
            System.out.println("Unesite broj: ");
            broj = s.nextInt();

            if (broj == 1) {
                jedan++;
            }
            if (broj == 2) {
                dva++;
            }
            if (broj == 3) {
                tri++;
            }
            if (broj == 4) {
                cetiri++;
            }
            if (jedan >= 1 && dva >= 1 && tri >= 1 && cetiri >= 1) {
                limit = true;
                System.out.println("Kraj programa jer su unete sve 4 cifre.");
            }


        }
    }
}
