import java.util.*;

public class Infix_to_Prefix {

    // Function to get precedence of operators
    static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3; // right-associative
        }
        return -1;
    }

    static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

    // Function to reverse expression and swap '(' with ')'
    static String reversed(String expr) {
        StringBuilder sb = new StringBuilder();
        for (int i = expr.length() - 1; i >= 0; i--) {
            char c = expr.charAt(i);
            if (c == '(') {
                sb.append(')');
            } else if (c == ')') {
                sb.append('(');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // Infix to Postfix logic (used after reversal)
    static String infixToPostfix(String expr) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : expr.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == '(')
                    stack.pop();
            } else if (isOperator(c)) {
                while (!stack.isEmpty() && precedence(stack.peek()) > precedence(c)) {
                    if (c == '^' && stack.peek() == '^') break; // Handle right-associativity of ^
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    // Main conversion: Infix to Prefix
    public static String convertToPrefix(String infix) {
        String reversed = reversed(infix);
        String postfix = infixToPostfix(reversed);
        return new StringBuilder(postfix).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Infix Expression (no spaces): ");
        String infix = sc.nextLine();

        String prefix = convertToPrefix(infix);
        System.out.println("Prefix Expression: " + prefix);
        sc.close();
    }
}
