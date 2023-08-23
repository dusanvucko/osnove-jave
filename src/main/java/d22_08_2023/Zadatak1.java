package d22_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {


        //Napisati program koji sabira brojeve koje korisnik unosi, pritom da suma ne predje 100.Na kraju programa ispisati sracunatu sumu.
        //Unesite vrednost: 20
        //Unesite vrednost: 50
        //Unesite vrednost: 50
        //Prekoracenje! Kraj programa. Sracunata suma je 70.

        Scanner s = new Scanner(System.in);

        boolean prekoracenje = false;

        int sum = 0;

        while (!prekoracenje) {
            System.out.println("Unesite vrednost");
            int x = s.nextInt();


        if ((sum+x)>100) {
            System.out.println("Prekoracenje! ");
            prekoracenje=true;
        }else {
                sum = sum + x;
            }

    }
}
}
