package p17_08_2023;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite ime: ");
        String ime = s.next();

        System.out.print("Unesite prezime: ");
        String prezime = s.next();

        System.out.println("Unesite broj telefona: ");
        String brojTelefona = s.next();

        System.out.println("Unesite e-mail: ");
        String email = s.next();

        System.out.print("Unesite JMBG: ");
        String jmbg = s.next();

        System.out.println(ime + " " + prezime + " - " + jmbg);
        System.out.println("Broj tel: " + brojTelefona);
        System.out.println("Email: " + email);




    }
}
