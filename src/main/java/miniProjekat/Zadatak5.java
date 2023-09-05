package miniProjekat;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Zadatak5 {
    public static void main(String[] args) {


//        Kako biste saznali više o generisanju random brojeva u programiranju, preporučujemo da istražite sledeći link: random koristeci Random class. Ovaj resurs će vam pružiti detaljnije razumevanje kako programi generišu slučajne brojeve i kako ih možete koristiti u različitim situacijama.
//
//        Napišite program koji simulira automatsko generisanje random passworda. Korisnik će uneti željenu dužinu passworda, a program će kreirati i ispisati password koji zadovoljava te parametre. Ovaj zadatak zahteva implementaciju različitih metoda za generisanje karaktera i passworda.
//                generisiRandomKarakter: Ova metoda generiše i vraća random karakter. Metoda koristi niz stringova sa elementima koji predstavljaju mala slova, velika slova i brojeve (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
//        generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter. Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.
//
//                Napomena: Metode generisiRandomSpecijalanKarakter generisiRandomKarakter nemaju nikakvu stampu u sebi!
//
//                Glavni program:
//        - Korisnik unosi dužinu passworda i informaciju da li treba sadržati specijalan karakter.
//                - Koristeći metodu `generisiPassword`, program generiše i ispisuje password.


                Scanner s = new Scanner(System.in);

        System.out.println("Unesite duzinu passworda: ");
        int passwordLength = s.nextInt();

        System.out.println("Da li zelite da sadrzi specijalan karakter; ");
        boolean containsSpecialCharacter = s.nextBoolean();

        String password = generatePassword(passwordLength, containsSpecialCharacter);

        System.out.println("Generisan password: " + password);


    }

    public static String generateRandomCharacter () {

        Random random = new Random();

        ArrayList<String> array = new ArrayList<>();

        array.add("a");
        array.add("Z");
        array.add("p");
        array.add("q");
        array.add("0");
        array.add("s");
        array.add("y");
        array.add("b");
        array.add("r");
        array.add("D");
        array.add("d");
        array.add("9");
        array.add("5");
        array.add("t");
        array.add("A");
        array.add("L");
        array.add("w");
        array.add("6");
        array.add("4");

        int index = random.nextInt(array.size());

        return array.get(index);
    }

    public static String generateRandomSpecialCharacter() {

        Random random = new Random();

        ArrayList <String> specialCharacters = new ArrayList<>();

        specialCharacters.add("@");
        specialCharacters.add("#");
        specialCharacters.add("&");
        specialCharacters.add("*");
        specialCharacters.add("!");

        int index = random.nextInt(specialCharacters.size());

        return specialCharacters.get(index);
    }

    public static String generatePassword (int passwordLength, boolean containsSpecialCharacter) {

        Random random = new Random();
        String password = "";

        for (int i = 0; i < passwordLength ; i++)
        {

            if (containsSpecialCharacter)
            {
                if (random.nextBoolean())
                {
                    password = password.concat(generateRandomSpecialCharacter());
                }
                else
                {
                    password = password.concat(generateRandomCharacter());
                }
                continue;
            }

            password = password.concat(generateRandomCharacter());
        }

        return password;
    }
}
