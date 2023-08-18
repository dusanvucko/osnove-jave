package d_17_08_2023;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {


        //Napisati program koji simulira izvrsenja test case-a za redirekciju nakon uspesnog logovanja na sistem. Program sa tastature ucitava actual url stranice, expected url stranice i kod o gresci koja treba da se prikaze ukoliko actual stranica nije kao sto je ocekivano.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite url stranice: ");
        String actualUrl = s.next();

        System.out.println("Ocekivani url stranice: ");
        String expectedUrl = s.next();

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("1 test passed.");
        } else {
            System.out.println("Assertion Error: URL_Missmatch");
        }
    }
}
