import java.util.Scanner;
import java.util.Stack;

public class Prefix_Evaluation {

    static int evaluate(String prefix) {
        Stack<Integer> s = new Stack<>();

        // Loop from right to left
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);

            if (Character.isDigit(c)) {
                s.push(c - '0'); // Convert char digit to int
            } else if (c == ' ') {
                continue; // skip spaces if any
            } else {
                int op1 = s.pop();
                int op2 = s.pop();

                switch (c) {
                    case '+': s.push(op1 + op2); break;
                    case '-': s.push(op1 - op2); break;
                    case '*': s.push(op1 * op2); break;
                    case '/': s.push(op1 / op2); break;
                    case '%': s.push(op1 % op2); break;
                    case '^': s.push((int) Math.pow(op1, op2)); break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + c);
                }
            }
        }

        return s.pop(); // Final result
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Prefix Expression (no spaces, single-digit operands):");
        String prefix = sc.next();

        try {
            int result = evaluate(prefix);
            System.out.println("Evaluated answer is: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
