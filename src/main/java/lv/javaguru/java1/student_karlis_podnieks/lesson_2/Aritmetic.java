package lv.javaguru.java1.student_karlis_podnieks.lesson_2;

public class Aritmetic {
    public static void main(String[] args) {
        //Saskaitisana
        int a = 50;
        int b = 30;
        int result = a + b;
        System.out.println("Summa " + result);

        double x = 10.5;
        double y = 6.3;
        double resultDouble = x + y;
        System.out.println("Summa double " + resultDouble);

        // atnemsana
        int resultAtnemt = a - b;
        System.out.println("Starpiba " + resultAtnemt);

        double resultDoubleAtnemt = x - y;
        System.out.println("Starpiba double " + resultDoubleAtnemt);

        // reizinasana
        int resultReizinasana = a * b;
        System.out.println("Summa reizinajums " + resultReizinasana);

        double resultDoubleReizinasna = x * y;
        System.out.println("Reizinajums double " + resultDoubleReizinasna);

        //dalisana
        int resultatsDalisana = a / b;
        System.out.println("Summa dalisana " + resultatsDalisana);

        double resultDoubleDalisana = x / y;
        System.out.println("Summa double dalisana " + resultDoubleDalisana);

        //dalisana bez parpalikuma
        int resultBezAtlikuma = a % b;
        System.out.println("Rezultats bez atlikuma " + resultBezAtlikuma);

        double resultDoubleBezAtlikuma = x % y;
        System.out.println("Double bez atlikuma " + resultDoubleBezAtlikuma);

    }
}
