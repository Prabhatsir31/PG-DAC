import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Max_Sliding_Window
{
    static List<Integer> maxSlidingWindow(Integer arr[],int k)
    {
        List<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<=arr.length-k;i++)
        {
            int max = Collections.max(Arrays.asList(arr).subList(i, i + k));
            l.add(max);
        }
        return l;
    }
    public static void main(String[] args)
    {
        Integer[] arr = {1, 3, -1, -3, 5, 3, 6, 7}; 
        int k = 3; // Window size 
        List<Integer> result = maxSlidingWindow(arr, k);
        System.out.println("Sliding Window Maximums: " + result);
    }
}

// Output: 

// [3, 3, 5, 5, 6, 7]