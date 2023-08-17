package p17_08_2023;

import java.util.Scanner;

public class uvodScanner {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ime: ");
        String ime = s.next();

        System.out.println("Unesite prezime: ");
        String prezime = s.next();

        System.out.println("Unesite telesnu masu: ");
        double kg = s.nextDouble();

        System.out.println("Unesite da li ste aktivni: ");
        boolean aktivan = s.nextBoolean();

        System.out.println("IME " + ime);
        System.out.println("PREZIME " + prezime);
        System.out.println("KG " + kg);
        System.out.println("AKTIVAN " + aktivan);





    }
}



