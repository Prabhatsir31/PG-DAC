import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {

    // Method to perform binary search
    static int binarySearch(int a[], int start, int end, int key) {
        if (start <= end) { // Searching is on
            int mid = (start + end) / 2;
            if (a[mid] == key)
                return mid; // Key found
            else {
                if (key < a[mid])
                    return binarySearch(a, start, mid - 1, key); // Search in left half
                else
                    return binarySearch(a, mid + 1, end, key); // Search in right half
            }
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 25, 5, 40, 15, 30, 20}; // Unsorted array
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Sort the array before binary search
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the key to find: ");
        int keyToFind = scanner.nextInt(); // User input for the key to search

        int result = binarySearch(numbers, 0, numbers.length - 1, keyToFind);
        if (result != -1) {
            System.out.println("Key " + keyToFind + " found at index: " + result);
        } else {
            System.out.println("Key " + keyToFind + " not found in the array.");
        }

        scanner.close(); // Close the scanner
    }
}
