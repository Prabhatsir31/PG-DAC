import java.util.Scanner;

public class Circular_Queue_MenuD {
    int front, rear, size;
    int[] queue;

    public Circular_Queue_MenuD(int n) {
        size = n;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        return (front == 0 && rear == size - 1) || (rear + 1) % size == front;
    }

    boolean isEmpty() {
        return front == -1;
    }

    void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is Full!");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        queue[rear] = element;
        System.out.println(element + " enqueued.");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }

        System.out.println("Dequeued: " + queue[front]);

        if (front == rear) { // Only one element
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }

        System.out.print("Queue: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Circular Queue: ");
        int n = sc.nextInt();
        Circular_Queue_MenuD cq = new Circular_Queue_MenuD(n);

        while (true) {
            System.out.println("\n--- Circular Queue Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter element to enqueue: ");
                    int val = sc.nextInt();
                    cq.enqueue(val);
                }
                case 2 -> cq.dequeue();
                case 3 -> cq.display();
                case 4 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            } 
        }
    }
}
