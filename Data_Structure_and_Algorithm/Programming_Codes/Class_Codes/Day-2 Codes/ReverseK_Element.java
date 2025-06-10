// STEPS:
//     Use a Stack to reverse the order of the first k elements.
//     Remove those k elements from the front and push to the stack.
//     Pop from stack and enqueue back to the queue — now reversed.
//     Move the remaining (n-k) elements to the end to maintain their original order.
// Let me know if you want this as a menu-driven version or explanation in text format.

import java.util.*;

public class ReverseK_Element {
    public static void reverseKElements(Queue<Integer> q, int k) {
        if (q == null || k <= 0 || k > q.size()) {
            System.out.println("Invalid input.");
            return;
        }

        Stack<Integer> stack = new Stack<>();

        // Step 1: Push first k elements into stack
        for (int i = 0; i < k; i++) {
            stack.push(q.remove());
        }

        // Step 2: Enqueue stack contents back to queue (reversed part)
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

        // Step 3: Move the remaining (n - k) elements to the back
        int size = q.size();
        for (int i = 0; i < size - k; i++) {
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        System.out.print("Enter the number of elements in the queue: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the queue:");
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        System.out.print("Enter the value of k (how many elements to reverse): ");
        int k = sc.nextInt();

        System.out.println("Original Queue: " + queue);
        reverseKElements(queue, k);
        System.out.println("Queue after reversing first " + k + " elements: " + queue);
    }
}
