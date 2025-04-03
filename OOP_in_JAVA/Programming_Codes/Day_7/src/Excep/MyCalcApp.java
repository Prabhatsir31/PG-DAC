package Excep;

import java.util.Scanner;

public class MyCalcApp {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter an integer: ");
     
     try {
         int input = scanner.nextInt(); // Accept user input
         Calculator calculator = new Calculator();
         double result = calculator.caldouble(input); // Call the method
         System.out.println("Double of the number is: " + result);
     } catch (MyArithException e) {
         System.out.println("Error: " + e.getMessage()); // Print the error message
     } catch (Exception e) {
         System.out.println("Invalid input. Please enter an integer."); // Handle other exceptions
     } finally {
         scanner.close(); // Close the scanner
     }
 }
}