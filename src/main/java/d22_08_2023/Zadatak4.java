package d22_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        //Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
        //Primer izvrsenja 1:
        //Unesite broj:1
        //Unesite broj:2
        //Unesite broj:0
        //Unesite broj:2
        //Kraj programa.
        //(Objasnjenje: Kraj jer je uneto dve dvojke)
        //
        //Primer izvrsenja 1:
        //Unesite broj:1
        //Unesite broj:2
        //Unesite broj:1
        //Unesite broj:3
        //Unesite broj:1
        //Kraj programa.
        //(Objasnjenje: Kraj jer je uneto tri jedinice)

        Scanner s = new Scanner(System.in);

        int brojacJedan = 0;
        int brojacDva = 0;

        while(brojacJedan != 3 && brojacDva !=2) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();

            if (broj==1) brojacJedan++;
            else if (broj==2) brojacDva++;

            }
        System.out.println("Kraj");



        }
        }








