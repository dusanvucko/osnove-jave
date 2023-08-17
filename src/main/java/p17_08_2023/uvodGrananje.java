package p17_08_2023;

import java.util.Scanner;

public class uvodGrananje {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Pocetak.");

        System.out.println("Unesite X: ");
        int x = s.nextInt();

        System.out.println("Unesite Y: ");
        int y = s.nextInt();

        if(x > 10 || y <5)
        {
            System.out.println("X nije jednako Y");
        }
        System.out.println("Kraj.");
    }
}
