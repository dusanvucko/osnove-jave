package d_17_08_2023;

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {


        //Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu. Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite x za T1: ");
        int xt1 = s.nextInt();

        System.out.println("Unesite y za T1: ");
        int yt1 = s.nextInt();

        System.out.println("Unesite x za T2: ");
        int xt2 = s.nextInt();

        System.out.println("Unesite y za T2: ");
        int yt2 = s.nextInt();

        System.out.println("Unesite x za M: ");
        int xM = s.nextInt();

        System.out.println("Unesite y za M: ");
        int yM = s.nextInt();

        if (xM >= xt1 && xM <= xt2 && yM <= yt1 && yM >= yt2) {
            System.out.println("Kliknuto je u okviru forme.");
        } else {
            System.out.println("Nije kliknuto u okviru forme.");
        }


    }
}
