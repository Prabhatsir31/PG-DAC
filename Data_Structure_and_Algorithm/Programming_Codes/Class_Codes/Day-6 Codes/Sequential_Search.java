public class Sequential_Search {

    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 40, 15, 30, 20}; 
        int key = 15; 

        System.out.println("Array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        int result = linearSearch(arr, key);

        if (result == -1) {
            System.out.println("Element " + key + " not found");
        } else {
            System.out.println("Element " + key + " found at index " + result);
        }
    }
}
