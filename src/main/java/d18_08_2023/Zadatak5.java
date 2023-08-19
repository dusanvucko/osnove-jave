package d18_08_2023;

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {


        for (int i = 1; i < 101 ; i++) {
            if (i%2==0) {
                System.out.print("-" + i + ",");
            } else {
                System.out.print(i + ",");

            }
            
        }
    }
}
