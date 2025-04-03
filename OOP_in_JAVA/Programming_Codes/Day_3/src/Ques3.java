// 3) accept a character and display (using if.. else ) whether it is vowel or not.

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter the Character: ");
        char ch = sc.next().charAt(0);
        
        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is not a vowel.");
        }
        
        // Close the scanner
        sc.close();
    }
}