package p17_08_2023;

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Pocetak ");

        System.out.println("Unesite broj b: ");
        int b = s.nextInt();

        System.out.println("Unesite broj c: ");
        int c = s.nextInt();

        System.out.println("Unesite broj a: ");
        int a = s.nextInt();

        if (a >= b && a <= c)
        {
            System.out.println("a je u opsegu b do c");
        }

    }
}
