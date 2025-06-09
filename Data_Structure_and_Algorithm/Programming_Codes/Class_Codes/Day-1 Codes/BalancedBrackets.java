import java.util.Stack;
import java.util.Scanner;

public class BalancedBrackets {

    public static boolean brack(String expr) {
    Stack<Character> stack = new Stack<>();

    for (char ch : expr.toCharArray()) {
        if (ch == '(' || ch == '{' || ch == '[') {
            stack.push(ch);
        } else if (ch == ')' && (stack.isEmpty() || stack.pop() != '(')) {
            return false;
        } else if (ch == '}' && (stack.isEmpty() || stack.pop() != '{')) {
            return false;
        } else if (ch == ']' && (stack.isEmpty() || stack.pop() != '[')) {
            return false;
        }
    }
    return stack.isEmpty();
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an expression with brackets: ");
        String input = sc.nextLine();

        if (brack(input)) {
            System.out.println("The expression has well-formed parentheses.");
        } else {
            System.out.println("The expression does NOT have well-formed parentheses.");
        }

        sc.close();
    }
}
