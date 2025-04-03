// 10) accept 5 numbers in an array and display their sum.

import java.util.*;

public class Ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for(int i=0; i<5; i++){
            System.out.println("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of numbers: " + sum);
    }
}