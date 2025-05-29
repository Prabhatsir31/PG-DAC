// 16) accept 3 digit number and display whether it is armstrong or not.
//	[ A number is called as armstrong number if sum of cubes of digits of number is equal to the number itself ]

import java.util.*;

public class Ques16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3 digit number: ");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while (temp != 0) {
            int rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        }
        if (sum == n) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
    }
}