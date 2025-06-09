//Algorithm of Stack to Queue
//
// 1. Initialize:
//    - queue1 for main operations (empty)
//    - queue2 for temporary use (empty)
//    - capacity = N

// 2. isFull():
//    - Return true if queue1.size() == capacity
//    - Else return false

// 3. push(x):
//    - If isFull():
//        • Print "Stack is full — cannot push."
//        • Return
//    - Enqueue x into queue2
//    - While queue1 is not empty:
//        • Dequeue from queue1 and enqueue into queue2
//    - Swap queue1 and queue2
//    - Print "Pushed: x"

// 4. pop():
//    - If queue1 is empty:
//        • Print "Stack is empty."
//        • Return −1
//    - Else:
//        • Dequeue and return element from queue1

// 5. peek():
//    - If queue1 is empty:
//        • Print "Stack is empty."
//        • Return −1
//    - Else:
//        • Return (without removing) the front element of queue1

// 6. isEmpty():
//    - Return true if queue1 is empty
//    - Else return false

// 7. display():
//    - Print "Stack elements (top→bottom):"
//    - For each element in queue1 from front to back:
//        • Print the element

// 8. Main Program Loop:
//    - Use Scanner to read user’s choice:
//        1 → push
//        2 → pop
//        3 → peek
//        4 → isEmpty
//        5 → isFull
//        6 → display
//        7 → exit
//    - Perform the corresponding operation, print results

import java.util.*;

public class Stack_to_Queue {
    private Queue<Integer> queue1 = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();
    private final int capacity;
    private Scanner sc = new Scanner(System.in);

    public Stack_to_Queue(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull() {
        return queue1.size() == capacity;
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack is full -> cannot push.");
            return;
        }
        queue2.add(x);
        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }
        // Swap queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        System.out.println("Pushed: " + x);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        int removed = queue1.poll();
        System.out.println("Popped: " + removed);
        return removed;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        int top = queue1.peek();
        System.out.println("Top element: " + top);
        return top;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack elements (top→bottom):");
        for (int x : queue1) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public void run() {
        while (true) {
            System.out.println("1) Push\n2) Pop\n3) Peek\n4) isEmpty\n5) isFull\n6) Display\n7) Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int x = sc.nextInt();
                    push(x);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    System.out.println("isEmpty: " + isEmpty());
                    break;
                case 5:
                    System.out.println("isFull: " + isFull());
                    break;
                case 6:
                    display();
                    break;
                case 7:
                    System.out.println("Exiting.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter stack capacity: ");
        int cap = input.nextInt();
        Stack_to_Queue stack = new Stack_to_Queue(cap);
        stack.run();
    }
}
