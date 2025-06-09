import java.util.Scanner;
import java.util.Stack;

public class Post_Evaluation {
    
    static int evaluate(String postfix) {
        Stack<Integer> s = new Stack<>();

        for (char c : postfix.toCharArray()) {
            if (Character.isDigit(c)) {
                s.push(c - '0'); // Convert char to int (e.g., '5' to 5)
            } else { // Operator case
                int op2 = s.pop(); // Second operand
                int op1 = s.pop(); // First operand
                switch (c) {
                    case '+': s.push(op1 + op2); break;
                    case '-': s.push(op1 - op2); break;
                    case '*': s.push(op1 * op2); break;
                    case '/': s.push(op1 / op2); break;
                    case '%': s.push(op1 % op2); break;
                    case '^': s.push((int)Math.pow(op1, op2)); break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + c);
                }
            }
        }

        return s.pop(); // Final result
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Postfix Expression (no spaces, single-digit operands):");
        String postfix = sc.next();
        
        try {
            int result = evaluate(postfix);
            System.out.println("Evaluated answer is: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
