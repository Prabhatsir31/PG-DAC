import java.util.Scanner;
import java.util.Stack;

public class Deci_to_Bi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        Integer no = sc.nextInt();  

        if (no.equals(0)) {
            System.out.println("Binary: 0");
            return;
        }

        Stack<Integer> stack = new Stack<>(); 

        // Push remainders into stack
        while (no > 0) {
            Integer remainder = no % 2;
            stack.push(remainder);
            no = no / 2;
        }

        System.out.print("Binary: ");
        while (!stack.isEmpty()) {
            Integer bit = stack.pop();
            System.out.print(bit);
        }

        sc.close();
    }
}
