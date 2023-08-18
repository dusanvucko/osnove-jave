package p18_08_2023;

public class ifElseIf {

    public static void main(String[] args) {

        int time = 13;


        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 14) {
            System.out.println("Good day1.");
        }
            else if (time < 18) {
                System.out.println("Good day.");
        } else {
            System.out.println("Good evening");
        }


        System.out.println("kraj.");
    }
}
