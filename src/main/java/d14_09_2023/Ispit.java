package d14_09_2023;

public class Ispit {

    private String naziv;
    private int ocena;
    private String profesor;

    public Ispit(String naziv, int ocena, String profesor) {
        this.naziv = naziv;
        this.ocena = ocena;
        this.profesor = profesor;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public boolean polozen(){
        return this.ocena > 5 && this.ocena <= 10;
    }

    public void print(){
        System.out.println("Ispit: "+this.naziv+" - Profesor: "+this.profesor+" - Ocena: "+this.ocena);
    }
}

