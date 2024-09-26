package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;


public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Calculator ---");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power (x^b)");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            switch (choice) {
                case 1:
                    // Square Root
                    System.out.print("Enter a number: ");
                    double num = scanner.nextDouble();
                    logger.info("Executing square root for:"+num);
                    System.out.println("√" + num + " = " + Math.sqrt(num));
                    break;
                case 2:
                    // Factorial
                    System.out.print("Enter a positive integer: ");
                    int x = scanner.nextInt();
                    logger.info("Calculating Factoria; for:"+x);
                    if (x >= 0) {
                        System.out.println(x + "! = " + factorial(x));
                    } else {
                        System.out.println("Factorial is not defined for negative numbers.");
                    }
                    break;
                case 3:
                    // Natural Logarithm
                    System.out.print("Enter a positive number: ");
                    double y = scanner.nextDouble();
                    logger.info("Computing log of the given number:"+y);
                    if (y > 0) {
                        System.out.println("ln(" + y + ") = " + Math.log(y));
                    } else {
                        System.out.println("Natural logarithm is only defined for positive numbers.");
                    }
                    break;
                case 4:
                    // Power
                    System.out.print("Enter the base (x): ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent (b): ");
                    double exponent = scanner.nextDouble();
                    logger.info("Computing x^n where x="+base+"and n="+exponent);
                    System.out.println(base + "^" + exponent + " = " + Math.pow(base, exponent));
                    break;
                default:
                    System.out.println("Invalid option! Please choose a valid operation.");
                    break;
            }
        }
    }

    // Method to calculate factorial of a number
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
