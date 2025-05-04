package org.example;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> addition = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> subtraction = (a, b) -> a - b;
        BiFunction<Integer, Integer, Integer> multiplication = (a, b) -> a * b;
        BiFunction<Integer, Integer, Integer> division = (a, b) -> b != 0 ? a / b : null;

        int num1 = 12;
        int num2 = 4;

        System.out.println("Addition of " + num1 + " and " + num2 + " = " +
                FunctionalCalculator.calculate(num1, num2, addition));

        System.out.println("Subtraction of " + num1 + " and " + num2 + " = " +
                FunctionalCalculator.calculate(num1, num2, subtraction));

        System.out.println("Multiplication of " + num1 + " and " + num2 + " = " +
                FunctionalCalculator.calculate(num1, num2, multiplication));

        System.out.println("Division of " + num1 + " by " + num2 + " = " +
                FunctionalCalculator.calculate(num1, num2, division));
    }
}
