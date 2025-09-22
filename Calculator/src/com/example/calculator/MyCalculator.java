package com.example.calculator;

import java.util.Scanner;

public class MyCalculator {

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Not a Number
        }
    }
    
    
   public static void main(String[] args) {
	
	   Scanner scanner = new Scanner(System.in);
       boolean running = true;

       System.out.println("=== Basic Calculator ===");

       while (running) {
           System.out.print("\nEnter first number: ");
           double num1 = scanner.nextDouble();

           System.out.print("Enter operator (+, -, *, /): ");
           char operator = scanner.next().charAt(0);

           System.out.print("Enter second number: ");
           double num2 = scanner.nextDouble();

           double result;

           switch (operator) {
               case '+':
                   result = add(num1, num2);
                   System.out.println("Result: " + result);
                   break;
               case '-':
                   result = subtract(num1, num2);
                   System.out.println("Result: " + result);
                   break;
               case '*':
                   result = multiply(num1, num2);
                   System.out.println("Result: " + result);
                   break;
               case '/':
                   result = divide(num1, num2);
                   if (!Double.isNaN(result)) {
                       System.out.println("Result: " + result);
                   }
                   break;
               default:
                   System.out.println("Invalid operator!");
                   break;
           }

           // Ask user if they want to continue
           System.out.print("\nDo you want to perform another calculation? (y/n): ");
           char choice = scanner.next().charAt(0);
           if (choice == 'n' || choice == 'N') {
               running = false;
               System.out.println("Exiting Calculator. Goodbye!");
           }
       }

       scanner.close();
   }
}
