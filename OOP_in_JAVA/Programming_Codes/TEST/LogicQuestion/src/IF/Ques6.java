package IF;

import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        
        // Call the method to find minimum consecutive occurrences of "one"
        int result = findMinimum(input);
        
        // Print the result
        System.out.println(result);
        sc.close(); 
    }

    public static int findMinimum(String str) {
        int count = 0; // To count consecutive occurrences
        int minCount = Integer.MAX_VALUE; // To track the minimum count of consecutive "one"
        
        // Split the string by "one"
        String[] parts = str.split("one");
        
        // Check for consecutive occurrences
        for (int i = 0; i < parts.length - 1; i++) {
            // Check if the next part is empty, indicating a consecutive "one"
            if (parts[i].isEmpty()) {
                count++;
            } else {
                // If we encounter a non-empty part, reset the count
                if (count > 0) {
                    minCount = Math.min(minCount, count);
                    count = 0; // Reset count
                }
            }
        }
        
        // Check if the last part was also empty
        if (count > 0) {
            minCount = Math.min(minCount, count);
        }
        
        // If minCount was updated, return it; otherwise, return -1
        return minCount == Integer.MAX_VALUE ? -1 : minCount;  
    }
}
