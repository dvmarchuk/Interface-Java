package Lesson3;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = (a, b) -> System.out.println(a + b);

        calculator.calculate(2,3);
        System.out.println(calculator.calc(3,4));


        Weather(Season.SPRING);
        System.out.println(Season.WINTER.isSnow());

    }

    public static void Weather(Season season){

    }
}
