
/*  
take the input from user take the integer, float, double, and boolean and perform the arithematic operation 
*/

package Practice;

import java.util.*;

class Ques1 {
	public static void main(String[] args) {

		System.out.println("enter the two number");
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println("Two number that u enetered is " + a + "," + b);

			// perform the addition operation
			int sum = a + b;
			System.out.println("Sum of two numbers is: " + sum);
			// perform the subtraction operation
			int diff = a - b;
			System.out.println("Difference of two numbers is: " + diff);
			// perform the multiplication operation
			int product = a * b;
			System.out.println("Product of two numbers is: " + product);
			// perform the division operation
			// we need to handle the ArithmeticException which is thrown when we divide by
			// zero
			try {
				double quotient = (double) a / b;
				System.out.println("Quotient of two numbers is: " + quotient);
			} catch (ArithmeticException e) {
				System.out.println("Error: Division by zero is not allowed");
			}
			// // take the boolean input from user and perform the logical operation
			// boolean c = sc.nextBoolean();
			// boolean d = sc.nextBoolean();
			// // perform the AND operation
			// boolean and = c && d;
			// System.out.println("AND of two boolean values is: " + and);
			// // perform the OR operation
			// boolean or = c || d;
			// System.out.println("OR of two boolean values is: " + or);
			// // perform the NOT operation
			// boolean not = !c;
			// System.out.println("NOT of boolean value is: " + not);
			// // take the float and double input from user and perform the arithmetic
			// // operation
			// float e = sc.nextFloat();
			// double f = sc.nextDouble();
			// // perform the addition operation
			// double sumFloatDouble = e + f;
			// System.out.println("Sum of float and double is: " + sumFloatDouble);
			// // perform the subtraction operation
			// double diffFloatDouble = e - f;
			// System.out.println("Difference of float and double is: " + diffFloatDouble);
		}
	}
}