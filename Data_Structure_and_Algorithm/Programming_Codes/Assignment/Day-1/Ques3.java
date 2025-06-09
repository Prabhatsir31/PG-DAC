// Sort a Stack
// ✅ Problem Definition
// You are given a stack with unsorted integers.
//  You must sort the elements in ascending order (smallest at the top) using only one extra stack.
// 🚫 Constraints:
// ❌ You are not allowed to use recursion
// ❌ You are not allowed to use arrays or other data structures like queues or lists
// ✅ You can only use one additional stack
// 🎯 Objective
// Transform:
// Input Stack (Top → Bottom): 3, 5, 1, 4
// Sorted Stack (Top → Bottom): 1, 3, 4, 5
// 🧠 Logic
// Pop the top element curr from the originalStack
// While the top of tempStack is greater than curr,
//  → pop from tempStack and push it back to originalStack
// Push curr into tempStack
// Repeat until originalStack is empty
// Finally, tempStack holds all elements in sorted order (smallest on top)
// Transfer back if required


import java.util.Scanner;
import java.util.Stack;

public class Ques3 {
    public static void main(String[] args) {
        Stack<Integer> originalStack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();

        originalStack.push(3);
        originalStack.push(5);
        originalStack.push(1);
        originalStack.push(4);

        while(!originalStack.isEmpty()) {
            int curr = originalStack.pop();

            while(!tempStack.isEmpty() && tempStack.peek() > curr) {
                originalStack.push(tempStack.pop());
            }

            tempStack.push(curr);
        }
        while(!tempStack.isEmpty()) {
            originalStack.push(tempStack.pop());
        }
        System.out.println("Sorted Stack (Top -> Bottom): ");
        while(!originalStack.isEmpty()) {
            System.out.println(originalStack.pop());
        }
    }
}