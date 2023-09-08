package d07_09_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        // Zadatak 5: Kreiranje klase "Oprema"
        //Napišite klasu "Oprema" sa atributima: tip (String), marka (String) i cena (double).
        // U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti unosom sa tasture. Ispisati informacije o opremi.

        Scanner scanner = new Scanner(System.in);

        Oprema a = new Oprema();
        System.out.println("Unesite tip opreme: ");
        a.tip = scanner.next();

        System.out.println("Unesite marku opreme: ");
        a.marka = scanner.next();

        System.out.println("Unesite cenu opreme: ");
        a.cena = scanner.nextDouble();

        Oprema b = new Oprema();
        System.out.println("Unesite tip opreme: ");
        b.tip = scanner.next();

        System.out.println("Unesite marku opreme: ");
        b.marka = scanner.next();

        System.out.println("Unesite cenu opreme: ");
        b.cena = scanner.nextDouble();

        Oprema c = new Oprema();
        System.out.println("Unesite tip opreme: ");
        c.tip = scanner.next();

        System.out.println("Unesite marku opreme: ");
        c.marka = scanner.next();

        System.out.println("Unesite cenu opreme: ");
        c.cena = scanner.nextDouble();

        System.out.println("Oprema: " + a.tip + ", marke: " + a.marka + ", kosta: " + a.cena);
        System.out.println("Oprema: " + b.tip + ", marke: " + b.marka + ", kosta: " + b.cena);
        System.out.println("Oprema: " + c.tip + ", marke: " + c.marka + ", kosta: " + c.cena);
    }
}
