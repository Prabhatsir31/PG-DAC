/*
maintain ICC ranking of at least 5 batsmen in the "HashMap".
list should be maintain as "rank" "name"
e.g. "1" "Rohit Sharma".
Now ask any rank bet'n 1 to 5 from user. ( user input).
if user asks for a particular rank , retrieve batsman name for that rank from the HashMap.
*/
package Generic;

import java.util.HashMap;
import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {
        HashMap<Integer, String> batsmenRanking = new HashMap<>();
        batsmenRanking.put(1, "Rohit Sharma");
        batsmenRanking.put(2, "Virat Kohli");
        batsmenRanking.put(3, "Joe Root");
        batsmenRanking.put(4, "Kane Williamson");
        batsmenRanking.put(5, "Steve Smith");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a rank between 1 and 5: ");
        int rank = scanner.nextInt();

        if (batsmenRanking.containsKey(rank)) {
            String batsmanName = batsmenRanking.get(rank);
            System.out.println("Batsman at rank " + rank + ": " + batsmanName);
        } else {
            System.out.println("Invalid rank! Please enter a rank between 1 and 5.");
        }

        scanner.close();
    }
}