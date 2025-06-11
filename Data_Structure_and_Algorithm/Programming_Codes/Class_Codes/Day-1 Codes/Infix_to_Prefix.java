// import java.util.*;

// public class InfixToPrefix {

//     // Function to get precedence of operators
//     static int precedence(char c) {
//         if (c == '+' || c == '-') 
//             return 1;
//         else if (c == '*' || c == '/') 
//             return 2;
//         else if (c == '^')
//             return 3;
//         else 
//             return -1;
//     }

//     static boolean isOperator(char c) {
//         return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
//     }

//     // Function to reverse expression and swap '(' with ')'
//     static String reverseAndSwap(String expr) {
//         StringBuilder sb = new StringBuilder();
//         for (int i = expr.length() - 1; i >= 0; i--) {
//             char c = expr.charAt(i);
//             if (c == '(') {
//                 sb.append(')');
//             } else if (c == ')') {
//                 sb.append('(');
//             } else {
//                 sb.append(c);
//             }
//         }
//         return sb.toString();
//     }

//     // Infix to Postfix logic (used after reversal)
//     static String infixToPostfix(String expr) {
//         StringBuilder result = new StringBuilder();
//         Stack<Character> stack = new Stack<>();

//         for (char c : expr.toCharArray()) {
//             if (Character.isLetterOrDigit(c)) {
//                 result.append(c);
//             } else if (c == '(') {
//                 stack.push(c);
//             } else if (c == ')') {
//                 while (!stack.isEmpty() && stack.peek() != '(') {
//                     result.append(stack.pop());
//                 }
//                 if (!stack.isEmpty() && stack.peek() == '(')
//                     stack.pop();
//             } else if (isOperator(c)) {
//                 while (!stack.isEmpty() && precedence(stack.peek()) > precedence(c)) {
//                     if (c == '^' && stack.peek() == '^')
//                         break; // Handle right-associativity of ^
//                     result.append(stack.pop());
//                 }
//                 stack.push(c);
//             }
//         }

//         while (!stack.isEmpty()) {
//             result.append(stack.pop());
//         }

//         return result.toString();
//     }

//     // Main conversion: Infix to Prefix
//     public static String convertToPrefix(String infix) {
//         String reversed = reverseAndSwap(infix);
//         String postfix = infixToPostfix(reversed);
//         return new StringBuilder(postfix).reverse().toString();
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Infix Expression (without spaces): ");
//         String infix = sc.nextLine();

//         String prefix = convertToPrefix(infix);
//         System.out.println("Prefix Expression: " + prefix);

//         sc.close();
//     }
// }


import java.util.Scanner;
import java.util.*;
public class Infix_to_Prefix{
	static int prec(char a) {
		if(a=='+'||a=='-') {
			return 1;
		}
		else if(a=='*'||a=='/') {
			return 2;
		}
		else {
			return 0;
		}
	}
	static String solve(String str) {
		Stack<Character> s=new Stack<>();
		String ans="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			if(ch==')') {
				s.push(ch);
			}
			else if(ch=='(') {
				while(s.peek()!=')') {
					ans+=s.pop();
				}
				s.pop();
			}
			else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
				while(!s.isEmpty()&&prec(ch)<prec(s.peek())) {
					ans+=s.pop();
				}
				s.push(ch);
			}
			else {
				ans+=ch;
			}
		}
		while(!s.empty()) {
			ans+=s.pop();
		}
		StringBuilder strans=new StringBuilder(ans);
		return strans.reverse().toString();
		
	}
	public static void main(String [] args) {
		System.out.println("Enter Expression Infix:");
		Scanner sc=new Scanner(System.in);
		String expr=sc.nextLine();
		String str=solve(expr);
		System.out.println(str);
	}
}