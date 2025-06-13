import java.util.*;

public class Merge_Sort {

    // Method to perform merge sort
    void mergeSort(int a[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }

    // Method to merge two halves
    void merge(int a[], int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int t[] = new int[a.length];
        int tindex = start;

        // Merging the two halves
        while (i <= mid && j <= end) {
            if (a[i] < a[j]) {
                t[tindex++] = a[i++];
            } else {
                t[tindex++] = a[j++];
            }
        }

        // Copy remaining elements of left half
        while (i <= mid) {
            t[tindex++] = a[i++];
        }

        // Copy remaining elements of right half
        while (j <= end) {
            t[tindex++] = a[j++];
        }

        // Copy merged elements back to original array
        for (i = start; i <= end; i++) {
            a[i] = t[i];
        }
    }

    public static void main(String[] args) {
        int[] a = {10, 25, 5, 40, 15, 30, 20};
        System.out.println("Original Array: " + Arrays.toString(a)); 

        Merge_Sort ms = new Merge_Sort();
        ms.mergeSort(a, 0, a.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(a));
    }
}
