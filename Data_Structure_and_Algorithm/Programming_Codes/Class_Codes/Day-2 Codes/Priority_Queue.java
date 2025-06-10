import java.util.*;

class Node {
    int data;
    int priority;

    Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
    }
}

class PriorityQueue {
    LinkedList<Node> queue = new LinkedList<>();

    void enqueue(int data, int priority) {
        Node newNode = new Node(data, priority);
        int i = 0;
        for (; i < queue.size(); i++) {
            if (priority < queue.get(i).priority) {
                break;
            }
        }
        queue.add(i, newNode); // Insert at correct position
        System.out.println("Inserted: " + data + " with priority " + priority);
    }

    void dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            Node removed = queue.removeFirst();
            System.out.println("Removed: " + removed.data + " with priority " + removed.priority);
        }
    }

    void display() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Priority Queue:");
        for (Node node : queue) {
            System.out.println("Data: " + node.data + ", Priority: " + node.priority);
        }
    }
}

public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.enqueue(10, 2);
        pq.enqueue(20, 1);
        pq.enqueue(30, 3);

        pq.display(); // Priority order should be: 20 (1), 10 (2), 30 (3)

        pq.dequeue(); // Removes 20
        pq.display();
    }
}
