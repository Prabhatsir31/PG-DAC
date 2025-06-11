import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {

    public static int binarySearch(int arr[], int left, int right, int x) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements (unsorted):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.print("Enter the element to search for: ");
        int x = scanner.nextInt();

        int result = binarySearch(arr, 0, arr.length - 1, x);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }

        scanner.close();
    }
}
