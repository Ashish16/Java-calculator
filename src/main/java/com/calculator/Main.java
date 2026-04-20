package com.calculator;

/**
 * Main class to demonstrate the Calculator functionality.
 */
public class Main {
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        // Example with integers
        int num1 = 10;
        int num2 = 20;
        int intSum = calculator.sum(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " = " + intSum);
        
        // Example with doubles
        double num3 = 15.5;
        double num4 = 24.5;
        double doubleSum = calculator.sum(num3, num4);
        System.out.println("Sum of " + num3 + " and " + num4 + " = " + doubleSum);
        
        // Example with command line arguments if provided
        if (args.length >= 2) {
            try {
                double arg1 = Double.parseDouble(args[0]);
                double arg2 = Double.parseDouble(args[1]);
                double result = calculator.sum(arg1, arg2);
                System.out.println("Sum of command line arguments: " + arg1 + " + " + arg2 + " = " + result);
            } catch (NumberFormatException e) {
                System.err.println("Error: Please provide valid numbers as arguments");
            }
        }
    }
}

// Made with Bob
