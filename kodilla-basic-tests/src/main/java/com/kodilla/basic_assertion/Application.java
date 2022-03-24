package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 9;

        int sumResult = calculator.sum(a ,b );
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        int subResult = calculator.subtract(a, b);
        boolean subCorrect = ResultChecker.assertEquals(-4, subResult);
        int squareResult = calculator.square(a);
        boolean squareCorrect = ResultChecker.assertEquals(25, squareResult);


        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        if (subCorrect) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        if (squareCorrect) {
            System.out.println("Metoda square działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczby " + a);
        }
    }
}
