// 15) accept a number and display whether it is prime or not.

import java.util.*;

public class Ques15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println(n + " is not a prime number.");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not a prime number.");
                    break;
                }
            }
            System.out.println(n + " is a prime number.");
        }
    }

}