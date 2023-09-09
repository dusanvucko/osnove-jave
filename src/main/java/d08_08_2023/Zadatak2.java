package d08_08_2023;

public class Zadatak2 {

    public static void main(String[] args) {

        FacebookPost jedan = new FacebookPost();
        jedan.korisnik = "Dusan Vuckovic";
        jedan.profil = "Dusan Vuckovic";
        jedan.text = "IT bootcamp masina.";

        FacebookPost dva = new FacebookPost();
        dva.korisnik = "Dusan Vuckovic";
        dva.profil = "Dusan Vuckovic";
        dva.text = "Dobar dan.";

        jedan.lajkovi();
        jedan.lajkovi();
        jedan.share();
        jedan.dislike();
        jedan.share();

        jedan.print();

        dva.lajkovi();
        dva.lajkovi();
        dva.share();
        dva.dislike();

        dva.print();
    }
}
