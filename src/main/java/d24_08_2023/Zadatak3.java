package d24_08_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {

        //Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.
        //Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1

        ArrayList<Integer> broj = new ArrayList<>();

        broj.add(1);
        broj.add(2);
        broj.add(3);
        broj.add(4);
        broj.add(5);
        broj.add(6);

        for (int i = 0; i < broj.size() - 1 ; i++) {
            int x = (broj.size() - 1) - i;
            int y = broj.get(x);

            System.out.print(y + ", ");
            }
        }
    }

