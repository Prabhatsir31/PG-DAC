package Queue_Examples;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Reverse_First_N {
    //call this iff n is in boundry of 0<n=size else error
    static Queue<Integer> reverseN(Queue<Integer> q, int n) {
        if (n <= 0 || n > q.size()) {
            System.out.println("Invalid value of n.");
            return q;
        }

        Stack<Integer> s = new Stack<>();

        // Step 1: Push first n elements into stack
        for (int i = 0; i < n; i++) {
            s.push(q.remove());
        }

        // Step 2: Enqueue back the reversed elements
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        // Step 3: Move the remaining (q.size() - n) elements to the back
        int size = q.size();
        for (int i = 0; i < size - n; i++) {
            q.add(q.remove());
        }

        return q;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        System.out.print("Enter total number of elements: ");
        int total = sc.nextInt();

        System.out.println("Enter " + total + " elements:");
        for (int i = 0; i < total; i++) {
            q.add(sc.nextInt());
        }

        System.out.println("Original Queue: " + q);

        System.out.print("Enter value of n (first n elements to reverse): ");
        int n = sc.nextInt();

        if (n > 0 && n <= total) {
            Queue<Integer> result = reverseN(q, n);
            System.out.println("Queue after reversing first " + n + " elements: " + result);
        } else {
            System.out.println("Error: Value of n must be between 1 and " + total);
        }
        sc.close();
    }
}
