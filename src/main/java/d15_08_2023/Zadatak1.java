package d15_08_2023;

public class Zadatak1 {

    public static void main(String[] args) {
        //Napisati program koji stampa verziju softvera. Verzija softvera se sastoji od major, minor i patch brojeva. Koristan link za verzionisanje softvera. Odstampati na ekranu verziju softvera u formatu:
        //[MAJOR].[MINOR].[PATCH]
        //
        //Objasnjenje: Npr u projektu koristite google-map paket sa verzijom 2.0.1 to znaci da je major 2, minor 0 i patch 1.

        int major = 4;
        int minor = 3;
        int patch = 1;

        System.out.print("Software version" + " " + major + " . " + minor + " . " + patch);

    }
}
