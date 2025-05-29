// 6) accept numbers and display as long as user does not enter 0.
import java.util.*;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        // Prompt the user for input
        System.out.println("Enter numbers (enter 0 to stop):");
        // Loop to accept numbers until 0 is entered
        while (true) {
            number = sc.nextInt(); // Read the number
            // Check if the entered number is 0
            if (number == 0) {
                break; // Exit the loop if 0 is entered
            }
            // Display the entered number
            System.out.println("You entered: " + number);
        }
        // Closing the scanner
        sc.close();
        System.out.println("Program terminated.");
    }
}
