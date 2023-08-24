package p22_08_2023;

import java.util.Scanner;

public class sistemZastavice {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int x = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.println("Unesite broj: ");
            x = s.nextInt();

            if (x < 10 || x > 50) {
                System.out.println("Broj " + x + " Nije u opsegu 10 do 50.");
            }
            if (x >= 10 && x <= 50) {
                isValid = true;

            }

            System.out.println("Broj " + x + " je validan. Kraj programa.");
        }
    }
}
