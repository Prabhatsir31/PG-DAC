import java.util.Scanner;

// Node structure
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List behaving as a Stack
public class LL_using_Stack_Menu {
    Node top = null;

    // Check if stack is empty
    boolean isEmpty() {
        return top == null;
    }

    // Push element onto stack
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + data);
    }

    // Pop element from stack
    void pop() {
        if (isEmpty()) {
            System.out.println("Underflow: Stack is empty");
        } else {
            System.out.println("Popped: " + top.data);
            top = top.next;
        }
    }

    // Peek top element
    void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + top.data);
        }
    }

    // Display all elements
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            Node temp = top;
            System.out.print("Stack (top to bottom): ");
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    // Main menu
    public static void main(String[] args) {
        LL_using_Stack_Menu stack = new LL_using_Stack_Menu();
        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}
