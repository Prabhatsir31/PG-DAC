import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Reverse_LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Input elements into the linked list and push to stack
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.add(value);
            stack.push(value);
        }

        // Print original list
        System.out.println("Original List: " + list);

        // Print reversed using stack
        System.out.print("Reversed List: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        sc.close();
    }
}
