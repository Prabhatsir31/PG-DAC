// 9) create int array of 5 elements and accept 5 values inside it. Now accept one more number and check whether that number is there inside array or not.

import java.util.*;

public class Ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            System.out.println("Enter one more number");
            int num = sc.nextInt();
            for (int j = 0; j < 5; j++) {
                if (arr[j] == num) {
                    System.out.println(num + " is present in array");
                    break;
                }
            }
        }
    }
}