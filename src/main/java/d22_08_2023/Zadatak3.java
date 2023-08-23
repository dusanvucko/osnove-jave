package d22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        //Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..
        //Primer izvrsenja:
        //Unesite rimski broj: X
        //Arapski: 10
        //Unesite rimski broj: C
        //Arapski: 50
        //Unesite rimski broj: D
        //Arapski: 500
        //Unesite rimski broj: M
        //Arapski: 1000
        //Unesite rimski broj: I
        //Arapski: 1
        //Unesite rimski broj: KRAJ
        //Kraj programa.


        Scanner s = new Scanner(System.in);

        boolean kraj = false;

        while(true) {
            int arapski = 0;
            System.out.println("Unesite rimski broj: ");
            String rimski = s.next();

            if (rimski.equals("Kraj")) {
                kraj = true;
            } else {
                if (rimski.equals("I")) arapski=1;
                else if (rimski.equals("V")) arapski=5;
                else if (rimski.equals("X")) arapski=10;
                else if (rimski.equals("L")) arapski=50;
                else if (rimski.equals("C")) arapski=100;
                else if (rimski.equals("D")) arapski=500;
                else if (rimski.equals("M")) arapski=1000;
                System.out.println("Arapski broj je: " + arapski);

                }



            }
            }
        }

