import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] a, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(a, start, end);
            quickSort(a, start, pivotIndex - 1); // Sort left part
            quickSort(a, pivotIndex + 1, end);   // Sort right part
        }
    }

    static int partition(int[] a, int start, int end) {
        int pivot = a[end]; // Choose the last element as pivot
        int i = start - 1; // Pointer for the smaller element

        for (int j = start; j < end; j++) {
            if (a[j] < pivot) {
                i++;
                // Swap a[i] and a[j]
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        // Swap the pivot element with the element at i + 1
        int temp = a[i + 1];
        a[i + 1] = a[end];
        a[end] = temp;

        return i + 1; // Return the partition index
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 4, 1, 5, 9, 2, 6};
        System.out.println("Original Array: " + Arrays.toString(a)); // Print original array

        quickSort(a, 0, a.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(a)); // Print sorted array
    }
}


// public class Quick {
//     static void sort(int a[], int start, int end) {
//         if (start >= end) return;  // Base case
        
//         int i = start;
//         int j = end;
//         int pivot = a[(start + end) / 2];  // Middle element as pivot
        
//         while (i <= j) {
//             while (a[i] < pivot) i++;
//             while (a[j] > pivot) j--;
            
//             if (i <= j) {
//                 int t = a[i];
//                 a[i] = a[j];
//                 a[j] = t;
//                 i++;
//                 j--;
//             }
//         }
//         // Recursive calls
//         if (start < j) sort(a, start, j);
//         if (i < end) sort(a, i, end);
//     }
    
//     public static void main(String[] args) {
//         int a[] = {3, 1, 4, 1, 5, 9, 2, 6};
//         sort(a, 0, a.length - 1);
//         for (int i : a)
//             System.out.print(i + " ");
//     }
// }