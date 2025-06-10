// sum the k value and find the max of the sum

import java.util.*;

public class Sliding_Window_SumMax {
    static int maxSumInSlidingWindow(Integer arr[], int k) {
        int maxSum = Integer.MIN_VALUE;

        System.out.println("Window sums:");
        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            System.out.print("Window " + Arrays.toString(Arrays.copyOfRange(arr, i, i + k)) + " -> ");
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            System.out.println("Sum = " + sum);
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3; // Window size

        int maxSum = maxSumInSlidingWindow(arr, k);
        System.out.println("\nMaximum sum in sliding windows of size " + k + ": " + maxSum);
    }
}


