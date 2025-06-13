import java.util.*;

public class Reverse_LinkedList {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        LinkedList<Integer> ll = new LinkedList<>();
        
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(400);
        
        for (Integer value : ll) {
            stack.push(value);
        }
        System.out.println("Original: " + stack);
        
        // // Clear the linked list
        ll.clear();
        
        while(!stack.isEmpty()){
            ll.add(stack.pop());
        }
        
        System.out.println("Reversed: " + ll);
    }
}
