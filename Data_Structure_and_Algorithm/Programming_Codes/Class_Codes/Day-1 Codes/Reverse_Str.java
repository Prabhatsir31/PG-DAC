import java.util.Scanner;
import java.util.Stack;

public class Reverse_Str {

    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();

        // Push all characters onto the stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        // Pop characters and build the reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();  // avoid StringBuilder as requested
        }

        return reversed;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String to reverse:");
        String input = sc.nextLine();

        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}
