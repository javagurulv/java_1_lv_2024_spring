package lv.javaguru.java1.student_karlis_podnieks.lesson_2;

import java.util.Random;

public class Variables {

    public static void main(String[] args) {

        int ageWife;
        int ageHusband = 40;
        ageWife = 21;

        System.out.println("Sievas vecums = " + ageWife);
        System.out.println("Vīra vecums = " + ageHusband);

        double weight = 80.5;
        boolean  hungry = true;
        char letter = 'K';

        System.out.println("Svars = " + weight);
        System.out.println("Izsalcis = " + hungry);
        System.out.println("Burts = " + letter);

        Random randomGenerator = new Random();
        int randomSkaitlis = randomGenerator.nextInt(101);

        System.out.println("Random generets skaitlis = " + randomSkaitlis);

    }
}
