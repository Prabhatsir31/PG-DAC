// 8) create int array of 5 elements and accept 5 values inside it. Now display all the numbers of array.

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        // Create an integer array of size 5
        int[] numbers = new int[5];
        // Accept 5 values from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt(); // Store the input in the array
        }
        // Display all the numbers in the array
        System.out.println("You entered the following numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
        // Closing the scanner
        sc.close();
    }
}
