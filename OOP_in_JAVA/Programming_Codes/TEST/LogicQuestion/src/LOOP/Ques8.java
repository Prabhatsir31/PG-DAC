package LOOP;

import java.util.Scanner;

//Accept a number from user and print that many numbers after the number.

/**
 * This program accepts two numbers from the user:
 * 1. A starting number
 * 2. A count of numbers to print after the starting number
 * It then prints the specified count of numbers following the starting number
 */
public class Ques8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the starting number: ");
        int startNumber = scanner.nextInt();
        
        System.out.print("Enter how many numbers to print after it: ");
        int count = scanner.nextInt();
        
        if (count <= 0) {
            System.out.println("Count must be a positive number.");
        } else {
            System.out.println("\nNumbers following " + startNumber + ":");
            for (int i = 1; i <= count; i++) {
                System.out.println(startNumber + i);
            }
        }
        
        scanner.close();
    }
}

