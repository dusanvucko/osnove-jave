package d_17_08_2023;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        //Napisati program koji za ucitava brojeve a i b (b ima vrednosti 1 ili 2) Ukoliko se za b unese:
        //b=1, vrednost promenljive a se uvecava za 10
        //b=2, vrednost promenljive a se smanjuje za 20
        //Na kraju zadatka odstampati novu vrednost promenljive a.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite vrednost a: ");
        int a = s.nextInt();

        System.out.println("Unesite vrednost 1 ili 2: ");
        int b = s.nextInt();

        if (b==1) {
            System.out.println(a + 10);
        }

        if (b==2) {
            System.out.println(a - 20);
        }



    }
}
