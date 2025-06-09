import java.util.*;

public class Infix_to_Postfix {
    static int precedence(char c) {
        if (c == '+' || c == '-') 
            return 1;
        else if (c == '*' || c == '/') 
            return 2;
        else if (c == '^')
            return 3;
        else 
            return -1;
    }

    // Method to convert infix to postfix
    public static String convert(String in) {
        StringBuilder post = new StringBuilder(); // use StringBuilder for efficiency
        Stack<Character> s = new Stack<>();

        for (char c : in.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                post.append(c); // if operand, add to output
            } 
            else if (c == '(') {
                s.push(c);
            } 
            else if (c == ')') {
                while (!s.isEmpty() && s.peek() != '(') {
                    post.append(s.pop());
                }
                if (!s.isEmpty() && s.peek() == '(')
                    s.pop(); // pop the '('
            } 
            else if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
                while (!s.isEmpty() && precedence(s.peek()) > precedence(c)) {
                    if (c == '^' && s.peek() == '^') break; // handle right associativity of '^'
                    post.append(s.pop());
                }
                s.push(c);
            }
        }

        // pop all remaining operators
        while (!s.isEmpty()) {
            post.append(s.pop());
        }

        return post.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Infix Expression (no spaces): ");
        String infix = sc.nextLine();

        String postfix = convert(infix);
        System.out.println("Postfix Expression: " + postfix);

        sc.close();
    }
}
