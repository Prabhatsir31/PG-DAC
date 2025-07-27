package LOOP;

import java.util.Scanner;

//Accept a number from user and find a factorial of a number.

public class Ques2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		
		int num = sc.nextInt(), fact = 1;
		
		for(int i = 2; i <= num; i++) {
			fact *= i;
		}
		
		System.out.println("Factorial of " + num + " is " + fact);
		sc.close();
	}
}
