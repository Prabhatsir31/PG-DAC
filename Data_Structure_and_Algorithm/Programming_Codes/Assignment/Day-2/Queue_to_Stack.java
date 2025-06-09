// Algorithm: Queue using Two Stacks
// 1. Initialize:
//    - stack1 for enqueue operations (empty)
//    - stack2 for dequeue operations (empty)
//    - capacity = N

// 2. isFull():
//    - Return true if (stack1.size() + stack2.size()) == capacity
//    - Else return false

// 3. enqueue(x):
//    - If isFull():
//        • Print "Queue is full — cannot enqueue."
//        • Return
//    - Push element x onto stack1
//    - Print "Enqueued: x"

// 4. dequeue():
//    - If stack2 is empty:
//        • While stack1 is not empty:
//            – Pop element from stack1
//            – Push it onto stack2
//    - If stack2 is still empty:
//        • Print "Queue is empty."
//        • Return −1
//    - Else:
//        • Pop and return the top element from stack2

// 5. peek():
//    - If stack2 is empty:
//        • While stack1 is not empty:
//            – Pop element from stack1
//            – Push it onto stack2
//    - If stack2 is still empty:
//        • Print "Queue is empty."
//        • Return −1
//    - Else:
//        • Return (without popping) the top element of stack2

// 6. isEmpty():
//    - Return true if stack1 and stack2 are both empty
//    - Else return false

// 7. display():
//    - Print "Queue elements (front→back):"
//    - For each element in stack2 (from top to bottom) print it
//    - Then for each element in stack1 (from bottom to top) print it

// 8. Main Program Loop:
//    - Use Scanner to read user’s choice:
//        1 → enqueue
//        2 → dequeue
//        3 → peek
//        4 → isEmpty
//        5 → isFull
//        6 → display
//        7 → exit
//    - Perform the corresponding operation, print results

import java.util.Scanner;
import java.util.Stack;

public class Queue_to_Stack {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    private final int capacity;

    public Queue_to_Stack(int capacity) {
        this.capacity = capacity;
    }

    // Check if the queue is full
    public boolean isFull() {
        return stack1.size() + stack2.size() == capacity;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Enqueue operation
    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is full -> cannot enqueue " + x);
            return;
        }
        stack1.push(x);
        System.out.println("Enqueued: " + x);
    }

    // Dequeue operation
    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            System.out.println("Queue is empty -> cannot dequeue");
            return -1;
        }
        int val = stack2.pop();
        System.out.println("Dequeued: " + val);
        return val;
    }

    // Peek operation
    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            System.out.println("Queue is empty -> nothing to peek");
            return -1;
        }
        int val = stack2.peek();
        System.out.println("Front element: " + val);
        return val;
    }

    // Display elements front → back
    public void display() {
        System.out.print("Queue elements (front -> back): ");
        // Elements in stack2 from top to bottom
        for (int i = stack2.size() - 1; i >= 0; i--) {
            System.out.print(stack2.get(i) + " ");
        }
        // Elements in stack1 from bottom to top
        for (int i = 0; i < stack1.size(); i++) {
            System.out.print(stack1.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue capacity: ");
        int cap = sc.nextInt();
        Queue_to_Stack queue = new Queue_to_Stack(cap);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. isEmpty");
            System.out.println("5. isFull");
            System.out.println("6. Display");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int val = sc.nextInt();
                    queue.enqueue(val);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    System.out.println("isEmpty: " + queue.isEmpty());
                    break;
                case 5:
                    System.out.println("isFull: " + queue.isFull());
                    break;
                case 6:
                    queue.display();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice -> try again.");
            }
        } while (choice != 7);

        sc.close();
    }
}
