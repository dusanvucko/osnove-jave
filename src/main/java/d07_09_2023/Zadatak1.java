package d07_09_2023;

public class Zadatak1 {

    //Zadatak 1: Kreiranje klase "Student"
    //Napišite klasu "Student" koja ima sledeće atribute: ime (String), brojIndeksa (int) i fakultet (String). Kreirajte 2-3 objekta ove klase u glavnoj metodi i postavite im vrednosti. Ispisati informacije o studentima.

    public static void main(String[] args) {

        Student a = new Student();
        a.ime = "Dusan Vuckovic";
        a.Index = 255225;
        a.fakultet = "IT Bootcamp";

        Student b = new Student();
        b.ime = "Milan Jovanovic";
        b.Index = 255220;
        b.fakultet = "IT Bootcamp";

        Student c = new Student();
        c.ime = "Vladimir Minic";
        c.Index = 255222;
        c.fakultet = "IT Bootcamp";

        System.out.println("Student: " + a.ime + ", broj indexa: " + a.Index + ", fakultet: " + a.fakultet);
        System.out.println("Student: " + b.ime + ", broj indexa: " + b.Index + ", fakultet: " + b.fakultet);
        System.out.println("Student: " + c.ime + ", broj indexa: " + c.Index + ", fakultet: " + c.fakultet);
    }
}
