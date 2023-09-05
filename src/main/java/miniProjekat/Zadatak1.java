package miniProjekat;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        //**Zadatak: Simulacija skidanja tekstualnog fajla**
        //Napišite program koji simulira proces skidanja tekstualnog fajla. Skidanje fajla se obavlja u paketima od po 5 karaktera. Pretpostavljamo da korisnik unosi podatke u skladu sa sledećim zahtevima:
        //
        //Korisnik unosi veličinu fajla u bajtovima, pri čemu svaki karakter zauzima 1 bajt.
        //Ako broj karaktera u fajlu nije deljiv sa 5, poslednji paket će sadržati manje od 5 karaktera.
        //Korisnik će biti upitan za podatke svakog paketa kroz for petlju. Nakon unosa svakog paketa, program treba da prikaže procenat trenutno skinutog fajla. Na programu je da odredi koliko paketa je potrebno za ceo fajl.
        //Na kraju programa, ispišite sadržaj celog fajla.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite velicinu fajla: ");
        int velicinaFajla = s.nextInt();


        int brojPaketa = 0;
        int velicinaZadnjegPaketa = 5;

        if (velicinaFajla % 5 == 0)
        {
            brojPaketa = velicinaFajla / 5;
        }
        else
        {
            velicinaZadnjegPaketa = velicinaFajla % 5;
            brojPaketa = (velicinaFajla - velicinaZadnjegPaketa) / 5;
            brojPaketa = brojPaketa + 1;
        }


        String fajl = "";
        double ukupanProcenat = 0;
        double procenatPoPaketu = (double) 100 / brojPaketa;


        for (int i = 1; i <= brojPaketa; i++)
        {
            boolean zadnjiPaket = i == brojPaketa;

            System.out.println("Unesite paket: ");
            String paket = s.next();

            if (zadnjiPaket && paket.length() != velicinaZadnjegPaketa)
            {
                System.out.println("Paket mora imati tacno " + velicinaZadnjegPaketa + " karaktera, \nUnesite paket: ");
                paket = s.next();
            }

            if (!zadnjiPaket && paket.length() != 5)
            {
                System.out.println("Paket mora imati tacno 5 karaktera, \nUnesite paket: ");
                paket = s.next();
            }


            fajl = fajl + paket;

            ukupanProcenat = (double) 100 / ((double) velicinaFajla / fajl.length());

            System.out.println("Skinuto " + ukupanProcenat + "%");
        }

        System.out.println("Sadržaj fajla je: " + fajl);
    }
}
