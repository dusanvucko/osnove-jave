package d08_08_2023;

public class Proizvod {

    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj() {
        System.out.println("{{" + this.naziv + " }} " + ",{{ " + this.cena + " }} " + ",{{" + this.tezina + "}}");
    }

    public void povecajCenu(double povecanje) {
        this.cena = this.cena + povecanje;
    }

    public double vratiCenuSaPopustom (double popust) {
        if (popust <0 || popust >100) {
            System.out.println("Popust nije validan.");
            return this.cena;
        }

        double cenaSaPopustom = this.cena - (this.cena * popust / 100);
        return cenaSaPopustom;
    }

    public double racunajPostarinu() {
        if (this.tezina <= 100) {
            return 200;
        } else if (this.tezina <=500) {
            return 400;
        }else {
            return 1000;
        }
    }

}
