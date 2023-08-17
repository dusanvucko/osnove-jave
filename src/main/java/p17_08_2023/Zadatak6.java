package p17_08_2023;

import java.util.Scanner;

public class Zadatak6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj a: ");
        int a = s.nextInt();

        System.out.println("Unesite broj b: ");
        int b = s.nextInt();

        System.out.println("Unesite broj c: ");
        int c = s.nextInt();

        if (a < 0) {
            System.out.println("Broj A nije validan.");
        }

        if (b < 0) {
            System.out.println("Broj B nije validan.");
        }

        if (c < 0) {
            System.out.println("Broj C nije validan.");
        }


    }
}
