import java.util.Arrays;

public class Bubble_Sort {
    static void Bubble_Sort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; 
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap a[j] and a[j+1]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break; // Array is already sorted
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {10, 25, 5, 40, 15, 30, 20};
        System.out.println("Original array: " + Arrays.toString(a));
        Bubble_Sort(a);
        System.out.println("Sorted array: " + Arrays.toString(a));
    }
}
