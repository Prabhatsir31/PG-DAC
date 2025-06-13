import java.util.Scanner;

public class Stack_Class_ADT {
    int top, maxSize, s[];
    
    Stack_Class_ADT(int size) {
        top = -1;
        maxSize = size;
        s = new int[maxSize];
    }

    void push(int e) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
        } else {
            s[++top] = e;
            System.out.println("Pushed: " + e);
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return s[top--];
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return s[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == maxSize - 1;
    }

    void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Stack elements (top to bottom):");
        for (int i = top; i >= 0; i--) {
            System.out.println(s[i]);
        }
    }

    // Main method for menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = sc.nextInt();
        Stack_Class_ADT stack = new Stack_Class_ADT(size);

        while (true) {
            System.out.print("""
                
                ----- Stack Menu -----
                1. Push
                2. Pop
                3. Peek
                4. Print Stack
                5. Exit
                Enter choice: """);

            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    stack.push(val);
                }
                case 2 -> {
                    
                    int popped = stack.pop();
                    if (popped != -1) System.out.println("Popped: " + popped);
                    // stack.pop();
                }
                case 3 -> {
                    int top = stack.peek();
                    if (top != -1) System.out.println("Top: " + top);
                    // stack.peek();
                }
                case 4 -> stack.printStack();
                case 5 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
