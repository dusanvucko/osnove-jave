package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        //Napisati program koji ucitava N brojeva i smesta ih u niz. Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
        //Unesite N: 5
        //Unesite broj: 1
        //Unesite broj: 3
        //Unesite broj: 4
        //Unesite broj: 7
        //Unesite broj: 8
        //U nizu ima 2 parna broja.

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> broj = new ArrayList<>();


        System.out.println("Unesite n:");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            broj.add(s.nextInt());
        }
        int brojac = 0;
        for (Integer i : broj) {
            if (i % 2 == 0) {
                brojac++;
            }
            System.out.println("Broj parnih brojeva je: " + brojac);

            ;
        }
    }
}
