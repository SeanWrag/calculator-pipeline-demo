package com.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum = calculator.add(10, 5);
        int difference = calculator.subtract(10, 5);
        int product = calculator.multiply(10, 5);

        System.out.println("Calculator Demo");
        System.out.println("10 + 5 = " + sum);
        System.out.println("10 - 5 = " + difference);
        System.out.println("10 * 5 = " + product);
    }
}