// 13) accept 6 characters in an array and toggle them [ only if they are alphabets ]

import java.util.*;

public class Ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[6];
        System.out.println("Enter 6 characters");
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.next().charAt(0);
            if (Character.isLetter(arr[i])) {
                if (arr[i] >= 'a' && arr[i] <= 'z') {
                    arr[i] = (char) (arr[i] - 'a' + 'A');
                } else if (arr[i] >= 'A' && arr[i] <= 'Z')
                    arr[i] = (char) (arr[i] - 'A' + 'a');
            }
        }
        System.out.println("Toggled array");
        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
