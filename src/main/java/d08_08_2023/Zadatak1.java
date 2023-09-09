package d08_08_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Proizvod jedan = new Proizvod();
        jedan.naziv = "Iberzokna";
        jedan.cena = 950;
        jedan.tezina = 250;

        Proizvod dva = new Proizvod();
        dva.naziv = "Iberlauf";
        dva.cena = 1020;
        dva.tezina = 600;

        jedan.stampaj();
        System.out.println("Cena sa 20% popusta: " + jedan.vratiCenuSaPopustom(20) + " dinara.");
        System.out.println("Postarina: " + jedan.racunajPostarinu() + " dinara.");

        dva.stampaj();
        System.out.println("Cena sa 10% popusta: " + dva.vratiCenuSaPopustom(10) + " dinara.");
        System.out.println("Postarina: " + dva.racunajPostarinu() + " dinara.");






    }
}
