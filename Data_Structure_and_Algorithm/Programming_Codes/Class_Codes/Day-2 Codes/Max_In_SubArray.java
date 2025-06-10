// Algorithm to Find Max in Sublist:
// ----------------------------------
// 1. Convert array to list using Arrays.asList()
// 2. Extract the sublist using list.subList(start, end + 1)
// 3. Use Collections.max(subList) to get the max value
// 4. Print the max


import java.util.*;

public class Max_In_SubArray {
    public static void main(String[] args) {
        Integer[] arr = {5, 8, 3, 12, 7, 9, 15, 2};

        int start = 2;  // starting index
        int end = 6;    // ending index (inclusive)

        List<Integer> list = Arrays.asList(arr);
        List<Integer> subList = list.subList(start, end + 1);

        int max = Collections.max(subList);

        System.out.println("Max value between index " + start + " and " + end + " is: " + max);
    }
}

