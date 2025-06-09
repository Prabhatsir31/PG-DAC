// Double Ended Queue (Deque)
// Problem Description:
// Implement a Double Ended Queue (Deque), which is a linear data structure that supports element insertion and deletion from both ends. Unlike a traditional queue (FIFO) or stack (LIFO), a Deque offers the flexibility of adding or removing elements from either the front or the back.
// The goal is to create a robust Deque implementation that provides efficient execution for its core operations.
// Core Operations to Implement:
// addFront(element): Adds an element to the front of the deque.
// addBack(element): Adds an element to the back of the deque.
// removeFront(): Removes and returns the element from the front of the deque. If the deque is empty, handle this appropriately (e.g., return null, undefined, or throw an error).
// removeBack(): Removes and returns the element from the back of the deque. If the deque is empty, handle this appropriately.
// peekFront(): Returns the element at the front of the deque without removing it. If the deque is empty, handle this appropriately.
// peekBack(): Returns the element at the back of the deque without removing it. If the deque is empty, handle this appropriately.
// isEmpty(): Returns a boolean indicating whether the deque is empty.
// size(): Returns the number of elements currently in the deque.

import java.util.ArrayList;

public class DqueueImplementation {

    ArrayList<Integer> a = new ArrayList<>();

    // Add at front (beginning of deque)
    void addFront(Integer element) {
        a.add(0, element);
        System.out.println("Inserted at front: " + element);
    }

    // Add at back (end of deque)
    void addBack(Integer element) {
        a.add(element);
        System.out.println("Inserted at back: " + element);
    }

    // Remove from front
    Integer removeFront() {
        if (a.isEmpty()) {
            System.out.println("Deque is empty - cannot remove front.");
            return null;
        }
        int temp = a.get(0);
        a.remove(0);
        return temp;
    }

    // Remove from back
    Integer removeBack() {
        if (a.isEmpty()) {
            System.out.println("Deque is empty - cannot remove back.");
            return null;
        }
        int temp = a.get(a.size() - 1);
        a.remove(a.size() - 1);
        return temp;
    }

    // Peek front
    Integer peekFront() {
        if (a.isEmpty()) return null;
        return a.get(0);
    }

    // Peek back
    Integer peekBack() {
        if (a.isEmpty()) return null;
        return a.get(a.size() - 1);
    }

    // Is Empty
    boolean isEmpty() {
        return a.isEmpty();
    }

    // Size
    int size() {
        return a.size();
    }

    // Print deque
    void printDeque() {
        System.out.println("Deque: " + a);
    }

    public static void main(String[] args) {
        DqueueImplementation dq = new DqueueImplementation();

        dq.addFront(10);  // [10]
        dq.addBack(20);   // [10, 20]
        dq.addFront(5);   // [5, 10, 20]

        dq.printDeque();  // Output: [5, 10, 20]

        System.out.println("Front: " + dq.peekFront()); // 5
        System.out.println("Back: " + dq.peekBack());   // 20

        System.out.println("Removed Front: " + dq.removeFront()); // removes 5
        System.out.println("Removed Back: " + dq.removeBack());   // removes 20

        dq.printDeque(); // [10]
        System.out.println("Is Empty: " + dq.isEmpty()); // false
        System.out.println("Size: " + dq.size());        // 1
    }
}
