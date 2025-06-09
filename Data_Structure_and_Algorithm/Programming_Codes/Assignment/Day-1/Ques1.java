// I. Using the Stack Class (Legacy Approach)
// The java.util.Stack class directly implements the LIFO principle. It extends Vector, which means it's a dynamic array and is synchronized.
// Key Methods:
// push(E item): Pushes an item onto the top of this stack.
// pop(): Removes the object at the top of this stack and returns that object.
// peek(): Looks at the object at the top of this stack without removing it.
// empty(): Tests if this stack is empty.
// search(Object o): Returns the 1-based position where an object is on this stack. Returns -1 if the object is not found.


import java.util.Stack;

public class Ques1 {
    public static void main(String[] args) {
        // Create a Stack of Strings
        Stack<String> stack = new Stack<>();

        // 1. Push elements onto the stack
        System.out.println("Pushing elements onto the stack:");
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Stack after pushes: " + stack); // Output: [Apple, Banana, Cherry]

        // 2. Peek at the top element
        System.out.println("\nPeeking at the top element: " + stack.peek()); // Output: Cherry
        System.out.println("Stack after peek: " + stack); // Stack remains unchanged: [Apple, Banana, Cherry]

        // 3. Pop elements from the stack
        System.out.println("\nPopping elements from the stack:");
        System.out.println("Popped: " + stack.pop()); // Output: Cherry
        System.out.println("Stack after first pop: " + stack); // Output: [Apple, Banana]

        System.out.println("Popped: " + stack.pop()); // Output: Banana
        System.out.println("Stack after second pop: " + stack); // Output: [Apple]

        // 4. Check if the stack is empty
        System.out.println("\nIs stack empty? " + stack.empty()); // Output: false

        System.out.println("Popped: " + stack.pop()); // Output: Apple
        System.out.println("Stack after third pop: " + stack); // Output: []

        System.out.println("Is stack empty? " + stack.empty()); // Output: true

        // Trying to pop from an empty stack will throw EmptyStackException
        try {
            stack.pop();
        } catch (java.util.EmptyStackException e) {
            System.out.println("Caught EmptyStackException: " + e.getMessage());
        }
    }
}
