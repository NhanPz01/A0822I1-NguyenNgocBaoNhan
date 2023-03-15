package com.example.ss_10_calculator;

public class Calculator {
    public static String calculate(double first, double second, char operator) {
        String result = null;
        switch (operator) {
            case '+':
                result = String.valueOf(first) + " + " + String.valueOf(second) + " = " + String.valueOf(first + second);
                break;
            case '-':
                result = String.valueOf(first) + " - " + String.valueOf(second) + " = " + String.valueOf(first - second);
                break;
            case '*':
                result = String.valueOf(first) + " * " + String.valueOf(second) + " = " + String.valueOf(first * second);
                break;
            case '/':
                result = String.valueOf(first) + " / " + String.valueOf(second) + " = " + String.valueOf(first / second);
                break;
        }
        return result;
    }
}
