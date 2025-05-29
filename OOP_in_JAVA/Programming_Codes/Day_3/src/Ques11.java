// 11) accept 5 numbers in an array and sort them in ascending order.

import java.util.*;

public class Ques11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[5];
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextDouble();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
