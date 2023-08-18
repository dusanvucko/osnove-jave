package d_17_08_2023;

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {

        //Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature (operator je string i moze imati vrednosti +, - , *, /) racuna  i ispisuje na ekranu odgovarajuci zbir, razliku, proizvod ili kolicnik za dva broja a i b uneta sa tastature.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite operator po vasoj zelji (+ , - , * , /): ");
        String operator = s.next();

        System.out.println("Unesite broj a:");
        double a = s.nextDouble();

        System.out.println("Unesite broj b: ");
        double b = s.nextDouble();

        if (operator .equals("+")) {
            System.out.println(a + b);
        }

        if (operator.equals("-")) {
            System.out.println(a - b);
        }

        if (operator.equals("*")) {
            System.out.println(a * b);
        }

        if (operator.equals("/")) {
            System.out.println(a / b);
        }
    }
}
