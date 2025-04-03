// 12) accept 2 numbers and display whether
// 	a) first number is greater
// 	b) second number is greater
// 	c) both are equal

import java.util.*;

public class Ques12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("Number One is Greater the number is " + num1);
        } else if (num2 > num1) {
            System.out.println("Number Two is Greater the number is " + num2);
        } else if (num1 == num2) {
            System.out.println("Both Numbers are Equal the number is " + num1);
        } else {
            System.out.println("Invalid Input");
        }
    }
}