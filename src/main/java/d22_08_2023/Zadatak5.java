package d22_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        //Napisati program koji proverava uparenost zagrada. Korisnik unosi matematicku formulu sve dok ne unese znak =.
        // Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
        //	Formula koja se koristi u primeru je: (2 * ( 1 + 3))=

        Scanner s = new Scanner(System.in);

        int brojac1 = 0;
        int brojac2 = 0;

        String unesi = "";

        while(!unesi.equals("=")) {
            System.out.println("Unesi: ");
            unesi = s.next();
            if (unesi.equals("(")) brojac1++;
            else if (unesi.equals(")")) brojac2++;

            }
        if(brojac2==brojac1) {
            System.out.println("Zagrade su uparene.");
        }
        else System.out.println("Zagrade nisu uparene.");

        }





    }

