package d08_08_2023;

public class FacebookPost {
    //Kreirati klasu FacebookPost koja ima:
    //   Od atributa:
    //ime i prezime korisnika koji je objavio post
    //ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
    //tekst objave
    //broj lajkova
    //broj deljenja
    //  Od metoda:
    //like(), koja povecava broj lajkova za 1.
    //dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
    //share(), koja povecava broj deljenja za 1
    //print(), koja stampa objavu u formatu:
    //(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
    //(tekst objave)
    //Likes (broj lajkova) | Shares (broj deljenja)

    public String korisnik;
    public String profil;
    public String text;
    public int brojLajkova;
    public int deljenja;

    public void lajkovi() {
        this.brojLajkova++;
    }

    public void dislike() {
        this.brojLajkova--;
    }

    public void share() {
        this.deljenja++;
    }

    public void print() {
        System.out.println(korisnik + "<<< " + profil);
        System.out.println(text);
        System.out.println("Likes: " + brojLajkova + "Shares: " + deljenja);
    }






}
