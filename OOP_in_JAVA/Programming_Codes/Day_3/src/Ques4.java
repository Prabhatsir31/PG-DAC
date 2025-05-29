// 4) accept 2 numbers and a character as operator ( + , - ,* , / , % ). Perform arithmetic according to the character entered.

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Accepting first number
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();       
        // Accepting second number
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();        
        // Accepting operator
        System.out.println("Enter operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);
        // Performing arithmetic operation
        double result = performArithmetic(num1, num2, op);        
        // Displaying the result
        System.out.println("Result: " + result);        
        // Closing the scanner
        sc.close();
    }

    // Method to perform arithmetic operations
    public static double performArithmetic(int num1, int num2, char op) {
        switch (op) {
            case '+':
                return num1 + num2; // Addition
            case '-':
                return num1 - num2; // Subtraction
            case '*':
                return num1 * num2; // Multiplication
            case '/':
                if (num2 != 0) {
                    return (double) num1 / num2; // Division
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return Double.NaN; // Return NaN for division by zero
                }
            case '%':
                if (num2 != 0) {
                    return num1 % num2; // Modulus
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return Double.NaN; // Return NaN for division by zero
                }
            default:
                System.out.println("Error: Invalid operator.");
                return Double.NaN; // Return NaN for invalid operator
        }
    }
}