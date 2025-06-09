// Problem Definition: Max Stack
// Problem Statement:
//  Design a stack that supports the following operations efficiently:
// push(x) — Push an element x onto the stack.
// pop() — Remove and return the top element.
// top() — Return the top element without removing it.
// getMax() — Return the maximum element in the stack in O(1) time.
// Constraints:
// Only use built-in data structures (no external libraries).
// All operations must be performed in constant or amortized constant time.
// Must handle both positive and negative integers.

import java.util.Scanner;
import java.util.Stack;

public class Ques2 {
    static Stack<Integer> N_stack = new Stack<>();
    static Stack<Integer> Max_stack = new Stack<>();

    // Push operation
    static void push(int e) {
        N_stack.push(e);
        if (Max_stack.isEmpty() || e >= Max_stack.peek()) {
            Max_stack.push(e);
        }
    }

    // Pop operation
    static int pop() {
        if (!N_stack.isEmpty()) {
            int removed = N_stack.pop();
            if (removed == Max_stack.peek()) {
                Max_stack.pop();
            }
            return removed;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    // Get current max
    static int getMax() {
        if (!Max_stack.isEmpty()) {
            return Max_stack.peek();
        } else {
            System.out.println("Max stack is empty");
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n------ Max Stack Menu ------");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Get Max");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = sc.nextInt();
                    push(value);
                    break;
                case 2:
                    int popped = pop();
                    if (popped != -1)
                        System.out.println("Popped: " + popped);
                    break;
                case 3:
                    int max = getMax();
                    if (max != -1)
                        System.out.println("Current Max: " + max);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}

