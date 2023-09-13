package d12_09_2023;

public class ZeleniKarton {

    //Zadatak
    //Kreirati klasu ZeleniKarton koja ima:
    //ime i prezime studenta
    //broj indeksa
    //naziv predmeta
    //ime i prezime profesora
    //ocenu - od 5 do 10
    //gettere i settere
    //konstruktore
    //metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
    //metodu stampaj koja stampa podatke u formatu:
    //		(naziv predmeta) - (ocena)
    //		Student: ime i prezime, broj indeksa
    //		Profesor: ime i prezime
    //
    //	U glavnoj klasi:
    //kreirati niz od 5 zelenih kartona za ispite i odstampati podatke za sve ispite
    //Zatim program pronalazi i ispisuje prosecnu ocenu za sve ispite

        private String punoIme;
        private String brojIndexa;
        private String nazivPredmeta;
        private String punoImeProfesora;
        private int ocena;

        public ZeleniKarton(String punoIme, String brojIndexa,String nazivPredmeta, String punoImeProfesora, int ocena){
            this.punoIme = punoIme;
            this.brojIndexa = brojIndexa;
            this.nazivPredmeta = nazivPredmeta;
            this.punoImeProfesora = punoImeProfesora;
            this.ocena = ocena;
        }
        public String getPunoIme() {
            return punoIme;
        }
        public void setPunoIme(String punoIme){
            this.punoIme = punoIme;
        }

        public String getBrojIndeksa() {
            return brojIndexa;
        }
        public void setBrojIndexa(String brojIndexa){
            this.brojIndexa = brojIndexa;
        }

        public String getNazivPredmeta() {
            return nazivPredmeta;
        }
        public void setNazivPredmeta(String nazivPredmeta){
            this.nazivPredmeta = nazivPredmeta;
        }

        public String getpunoImeProfesora() {
            return punoImeProfesora;
        }
        public void setPunoImeProfesora(String punoImeProfesora){
            this.punoImeProfesora = punoImeProfesora;
        }

        public int getOcena() {
            return ocena;
        }
        public void setOcena(int ocena) {
            if (ocena < 5 || ocena > 10) {
                System.out.println("Ocena mora biti između 5 i 10");
            }
            this.ocena = ocena;
        }
        public boolean jeIspitPolozen() {
            return ocena > 5;
        }
        public void stampaj() {
            System.out.println(nazivPredmeta + " - " + ocena);
            System.out.println("Student: " + this.punoIme + ", " + this.brojIndexa);
            System.out.println("Profesor: " + this.punoImeProfesora);
        }

    }




