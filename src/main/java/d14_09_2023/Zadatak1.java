package d14_09_2023;

public class Zadatak1 {

    public static void main(String[] args) {

        Ispit matematika = new Ispit("matematika1", 5,"Dusan Vuckovic");
        Ispit hemija = new Ispit("matematika2", 8,"Marija Marijic");
        Ispit mikroekonomija = new Ispit("fizika", 6,"Nemanja Nemanjic");
        Ispit statistika = new Ispit("elektrotehnika", 7,"Nikola Nikolic");

        Student student = new Student(123, "Jovan Jovanovic", "osnovne");
        student.dodajIspit(matematika);
        student.dodajIspit(hemija);
        student.dodajIspit(mikroekonomija);
        student.dodajIspit(statistika);

        student.stampaj();
    }
}
