// 2) accept a number and display whether it is divisible by 7 or not.

import java.util.*;
public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (n % 7 == 0) {
            System.out.println(n + " is divisible by 7");
        } else {
            System.out.println(n + " is not divisible by 7");
        }
    }
}