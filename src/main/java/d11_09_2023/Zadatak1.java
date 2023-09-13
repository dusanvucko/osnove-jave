package d11_09_2023;

public class Zadatak1 {

    //Kreirati klasu Autor koja ima
    //-ime i prezime
    //-konstuktore koje mislite da su vam potrebni
    //-gettere i settere za atribute
    //-metodu print koja stampa u formatu:
    //(ime autora) (prezime autora)
    //
    //Kreirati klasu Knjiga koji ima:
    //-ISBN
    //-naziv
    //-godina izdanja
    //-autor
    //-konstuktore koje mislite da su vam potrebni
    //-gettere i settere za atribute
    //-metodu print koja stampa u formatu (izbegavati dupliranje koda):
    //(ISBN)
    //(naziv) - (godina izdanja)
    //autor: (ime autora) (prezime autora)
    //
    //	U glavnom programu napraviti vise autora sa vise knjiga.

    public static void main(String[] args) {

        Autor autor1 = new Autor();
        autor1.setIme("Branko");
        autor1.setPrezime("Copic");

        Autor autor2 = new Autor("Ivo", "Andric");

        Knjiga knjiga1 = new Knjiga();
        knjiga1.setIsbn("1234567");
        knjiga1.setNaziv("Selidbe");
        knjiga1.setGodina(2017);
        knjiga1.setAutor(autor1);

        Knjiga knjiga2 = new Knjiga("12345644", "Na drini cuprija", 2020, autor1);

        Knjiga knjiga3 = new Knjiga();
        knjiga3.setIsbn("12345678787");
        knjiga3.setNaziv("Tom Sojer");
        knjiga3.setGodina(2019);
        knjiga3.setAutor(autor2);

        Knjiga knjiga4 = new Knjiga("78945645", "Luka", 2015, autor2);

        knjiga1.stampaj();
        knjiga2.stampaj();
        knjiga3.stampaj();
        knjiga4.stampaj();
    }
}

