package p22_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        //Napisati program koji simulira ponasanje jednog test case-a. Test case ima 5 provera, a program validira jednu po jednu proveru
        // sve dok ne proveri sve ili dok neka provera ne failuje.
        // Korisnik sa tastature za svaku proveru unosi expected rec i actual rec. U slucaju fail-a ispisati odgovarajucu poruku.

        Scanner s = new Scanner(System.in);

        String expected = "";
        String actual = "";

        int counter = 0;

        boolean result = false;


        int test = 0;

        while (result = true && test < 5) {
            System.out.println("Unesite expected result: ");
            expected = s.next();
            System.out.println("Unesite actual result: ");
            actual = s.next();

            test++;

            if (!actual.equals(expected)) {
                result = false;
                System.out.println("Test failed.");

            }

            if (result==true && test==5) {
                System.out.println("Test passed.");
            }






        }


    }
}
