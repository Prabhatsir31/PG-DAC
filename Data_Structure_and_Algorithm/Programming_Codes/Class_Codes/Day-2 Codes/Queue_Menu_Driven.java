import java.util.Scanner;

public class Queue_Menu_Driven {
    int front, rear, maxSize;
    int[] q;

    Queue_Menu_Driven(int size) {
        maxSize = size;
        rear = -1;
        front = -1;
        q = new int[maxSize];
    }

    boolean isFull() {
        return (front == (rear + 1) % maxSize);
    }

    boolean isEmpty() {
        return (front == -1);
    }

    void enqueue(int e) {
        if (isFull()) {
            System.out.println("Queue is Full!");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % maxSize;
            }
            q[rear] = e;
            System.out.println(e + " enqueued.");
        }
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.println("Dequeued: " + q[front]);
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % maxSize;
            }
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.print("Queue Elements: ");
            int i = front;
            do {
                System.out.print(q[i] + " ");
                if (i == rear) break;
                i = (i + 1) % maxSize;
            } while (true);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue size: ");
        int size = sc.nextInt();
        Queue_Menu_Driven cq = new Queue_Menu_Driven(size);

        int choice;
        do {
            System.out.print("""
                
                ---- Circular Queue Menu ----
                1. Enqueue
                2. Dequeue
                3. Display
                4. Exit
                Enter your choice: """);

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter value to enqueue: ");
                    int val = sc.nextInt();
                    cq.enqueue(val);
                }
                case 2 -> cq.dequeue();
                case 3 -> cq.display();
                case 4 -> System.out.println("Exiting...");
                default -> {
                    if (choice != 4) {
                        System.out.println("Invalid choice!");
                    }
                }
            }

        } while (choice != 4);

        sc.close();
    }
}
