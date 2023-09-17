package d15_09_2023;

public class Osoba {

    protected String punoIme;
    protected String jmbg;
    protected int godinaRodjenja;
    public Osoba() {
    }
    public Osoba(String punoIme, String jmbg, int godinaRodjenja) {
        super();
        this.punoIme = punoIme;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;
    }
    public String getPunoIme() {
        return punoIme;
    }
    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }
    public String getJmbg() {
        return jmbg;
    }
    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }
    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }
    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }
    public void stampaj() {
        System.out.println(this.punoIme + ", " + this.jmbg + ", " + this.godinaRodjenja);
    }
}

