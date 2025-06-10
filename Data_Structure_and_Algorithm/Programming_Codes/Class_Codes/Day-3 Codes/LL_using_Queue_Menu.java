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

public class LL_using_Queue_Menu {
    Node front = null, rear = null;

    void enqueue(int value) {
        Node newNode = new Node(value);
        if(rear == null) {
            front = rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Enqueue " + value);
    }

    // Dequeue operation (remove from front)
    void dequeue() {
        if (front == null) {
            System.out.println("Underflow: Queue is empty");
            return;
        }
        System.out.println("Dequeued: " + front.data);
        front = front.next;
        if (front == null) {
            rear = null;
        }
    }

    // Peek operation (see front element)
    void peek() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element: " + front.data);
        }
    }

    // Display the queue
    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue (front to rear): ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL_using_Queue_Menu queue = new LL_using_Queue_Menu();
        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n--- Queue Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    value = sc.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.display();
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
