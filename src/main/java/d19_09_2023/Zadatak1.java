package d19_09_2023;

public class Zadatak1 {

    public static void main(String[] args) {
        Korpa korpa = new Korpa();
        SuperKartica kartica = new SuperKartica(156, "Dusan Vuckovic", 20);
        StaklenaAmbalaza ambalaza = new StaklenaAmbalaza("1344521", "Koka kola", 80, 90, 0, false, 122);

        korpa.dodajAmbalazu(new Tetrapak("12546545", "Bademovo Mleko", 50, 60, true, 70));
        korpa.dodajAmbalazu(new StaklenaAmbalaza("125555", "Fanta", 60, 70, 40, true, 120));
        korpa.dodajAmbalazu(new Tetrapak("222256", "Cokoladno Mleko", 100, 150, false, 180));
        korpa.dodajAmbalazu(ambalaza);

        System.out.println(korpa.ukupnaCenaKorpe(kartica));
        System.out.println(ambalaza.cena());


        for (int i = 0; i < korpa.getAmbalaze().size(); i++) {
            korpa.getAmbalaze().get(i).stampaj();
        }
    }
}

