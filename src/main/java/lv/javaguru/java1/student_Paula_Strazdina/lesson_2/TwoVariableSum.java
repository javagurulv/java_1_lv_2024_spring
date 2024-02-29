package lv.javaguru.java1.student_Paula_Strazdina.lesson_2;

import java.util.Random;

public class TwoVariableSum {

    public static void main(String[] args) {

        double x = 4.75;
        double y = 6.85;
        double resultSum = x + y;
        int a = 9;
        int b = 7;
        int resultSumInt = a + b;
        int resultSub = a - b;
        int resultMult = a * b;
        int resultDiv = a / b;
        int resultMod = a % b;

        System.out.println(resultSumInt);
        System.out.println(resultSum);
        System.out.println(resultSub);
        System.out.println(resultMult);
        System.out.println(resultDiv);
        System.out.println(resultMod);

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(101);

        System.out.println(randomNumber);

    }
}
