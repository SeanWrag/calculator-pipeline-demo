package com.example;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("Application Started");
        System.out.println("Timestamp: " + LocalDateTime.now());
        System.out.println("Environment: Production");
        System.out.println("==================================");

        Calculator calculator = new Calculator();

        try {
            int sum = calculator.add(10, 5);
            int difference = calculator.subtract(10, 5);
            int product = calculator.multiply(10, 5);
            double division = calculator.divide(10, 5);

            System.out.println("Running Calculator Operations...");
            System.out.println("10 + 5 = " + sum);
            System.out.println("10 - 5 = " + difference);
            System.out.println("10 * 5 = " + product);
            System.out.println("10 / 5 = " + division);

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("==================================");
        System.out.println("Application Completed Successfully");
        System.out.println("Timestamp: " + LocalDateTime.now());
        System.out.println("==================================");
    }
}