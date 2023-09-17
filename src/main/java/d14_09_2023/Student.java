package d14_09_2023;

import java.util.ArrayList;

public class Student {

    private int brojIndeksa;
    private String imePrezime;
    private String tipStudija;
    private ArrayList<Ispit> ispiti;

    public Student(int brojIndeksa, String imePrezime, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imePrezime = imePrezime;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<>();
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }
    public void dodajIspit(Ispit ispit){
        this.ispiti.add(ispit);
    }

    public double prosek(){
        int sumaOcena = 0;
        int counter=0;
        for (int i = 0; i < this.ispiti.size(); i++) {
            if(this.ispiti.get(i).polozen()){
                sumaOcena+=this.ispiti.get(i).getOcena();
                counter++;
            }
        }
        return sumaOcena*1.0/counter;
    }

    public void stampaj(){
        System.out.println(this.brojIndeksa+" - "+this.imePrezime+" - "+this.tipStudija);
        System.out.println("Predmeti: ");
        for (int i = 0; i < this.ispiti.size(); i++) {
            this.ispiti.get(i).print();
        }
        System.out.println("Prosecna ocena: "+this.prosek());
    }
}

