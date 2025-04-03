package Test;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Read the input string

        int[] counts = countLetters(input);
        int lowercaseCount = counts[0];
        int uppercaseCount = counts[1];

        System.out.println("Lowercase letters count: " + lowercaseCount);
        System.out.println("Uppercase letters count: " + uppercaseCount);

        scanner.close();
    }

    static int[] countLetters(String s) {
        int lowercaseCount = 0;
        int uppercaseCount = 0;

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(c)) {
                uppercaseCount++;
            }
        }
        
        return new int[]{lowercaseCount, uppercaseCount};
    }
}