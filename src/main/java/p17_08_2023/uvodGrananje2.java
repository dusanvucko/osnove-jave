package p17_08_2023;

import java.util.Scanner;

public class uvodGrananje2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String email = "yahoo.com";

        if (!email.contains("gmail.com")) {
            System.out.println("Ime je Dusan.");
        }
    }
}
