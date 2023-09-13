package d12_09_2023;

public class Zadatak1 {

    public static void main(String[] args) {

        FizickoLice prodavac = new FizickoLice("Dusan Vuckovic", "121211121", "1234567890123", true);
        FizickoLice kupac = new FizickoLice("Milan Jovanovic", "244242424", "9876543210123", false);

        Ugovor ugovor = new Ugovor(2023, 25, 3, prodavac, kupac, 27500, "Palilula 22, Nis");
        ugovor.stampaj();
    }
}

