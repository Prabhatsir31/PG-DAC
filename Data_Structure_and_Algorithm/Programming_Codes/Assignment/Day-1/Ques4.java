// Next Greater Element (Using Stack)
// ✅ Problem Definition
// Given an array of integers, your task is to find the Next Greater Element (NGE) for every element.
// 👉 The Next Greater Element for an element x is the first greater element on the right side of x in the array.
//  If there is no greater element, output -1 for that position.
// 🧠 Concept
// You have to solve this efficiently in O(n) time using a stack, not brute-force.
// 1. Create a stack.
// 2. Traverse the array from end to start:
//     a. While stack is not empty and stack.peek() <= arr[i]:
//            stack.pop();  // remove useless smaller elements
//     b. If stack is empty:
//            NGE[i] = -1
//        Else:
//            NGE[i] = stack.peek(); // next greater found
//     c. Push arr[i] into the stack (it might be NGE for someone on the left)


import java.util.Scanner;
import java.util.Stack;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: array size and elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] nge = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();

        // Traverse the array from end to start
        for (int i = n - 1; i >= 0; i--) {
            // Step 1: Remove all elements smaller than or equal to current
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // Step 2: Assign NGE
            if (stack.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = stack.peek();
            }

            // Step 3: Push current element onto stack
            stack.push(arr[i]);
        }

        // Output result
        System.out.println("\nNext Greater Elements:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " -> " + nge[i]);
        }

        sc.close();
    }
}
