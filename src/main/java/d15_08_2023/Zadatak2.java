package d15_08_2023;

public class Zadatak2 {

    public static void main(String[] args) {
        //Napisati program koji stampa podatke o kreditnoj kartici u formatu kao na slici. Od informacija se pamti broj kartice (16 cifara sa razmacima), mesec i godina do kada vazi kartica, kao i ime i prezime vlasnika kartice. Kartica se stampa sa zvezdicama i ne brinite ukoliko neka zvezdica mrdne i nije u liniji to ce zavisiti od duzine imena.
        //Napomena: svaka informacija mora da bude u okviru posebne promenljive.

        String star = "**********************";
        String card = "* CREDIT CARD        *";
        String a= "*     *****         *";
        String cardNumber ="*1234 1232 4321 1212*";
        String valid = "*     valid > 10/25 *";
        String b="*                     *";
        String name= "   Dusan Vuckovic     ";
        String stars = "********************";

        System.out.println(star);
        System.out.println(card);
        System.out.println(a);
        System.out.println(cardNumber);
        System.out.println(valid);
        System.out.println(b);
        System.out.println(name);
        System.out.println(stars);



    }
}
