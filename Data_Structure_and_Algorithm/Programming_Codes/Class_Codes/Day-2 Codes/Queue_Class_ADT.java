public class Queue_Class_ADT {
    int front, rear, maxSize;
    int[] queue;

    public Queue_Class_ADT(int size) {
        maxSize = size;
        front = 0;
        rear = -1;
        queue = new int[maxSize];
    }

    boolean isFull() {
        return rear == maxSize - 1;
    }

    boolean isEmpty() {
        return front > rear;
    }

    void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is Full!");
        } else {
            queue[++rear] = element;
            System.out.println(element + " enqueued.");
        }
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.println("Dequeued: " + queue[front++]);
        }
    }

    void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.print("Queue Elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        Queue_Class_ADT q = new Queue_Class_ADT(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.printQueue(); // Output: 10 20 30

        q.dequeue();    // Removes 10
        q.printQueue(); // Output: 20 30

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);  // Now full
        q.enqueue(70);  // Should print "Queue is Full!"
        q.printQueue();
    }
}
