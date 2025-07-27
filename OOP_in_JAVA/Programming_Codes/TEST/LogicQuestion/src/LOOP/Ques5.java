package LOOP;

import java.util.Scanner;

//Accept a number from user and reverse it.

public class Ques5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		
		int num = sc.nextInt(), rev = 0;
		
		System.out.println("Before Reversed : " + num);
		
		while(num > 0) {
			rev = rev * 10 + (num % 10);
			num /= 10;
		}
	
		System.out.println("After Reversed: " + rev);
		
		sc.close();
	}
}
