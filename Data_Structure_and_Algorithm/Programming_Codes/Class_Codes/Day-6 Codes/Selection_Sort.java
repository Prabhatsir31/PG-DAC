import java.util.Arrays;

public class Selection_Sort {
    static void Selection_Sort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = a[i];
            int ref = i;
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[j] < min) {
                    min = a[j];
                    ref = j;
                }
            }//j
            a[ref]=a[i];//swapped
            a[i]=min;//swapped
        }//i
    }
   public static void main(String[] args) {
       int[] a = {10, 25, 5, 40, 15, 30, 20};
       System.out.println("Array has:"+Arrays.toString(a));
       Selection_Sort(a);
       System.out.println("Array has:"+Arrays.toString(a));


   }
}
