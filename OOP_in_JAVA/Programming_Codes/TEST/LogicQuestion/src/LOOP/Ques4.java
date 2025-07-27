package LOOP;

import java.util.Scanner;

//Accept a number from user and count number of digits.

public class Ques4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		
		int num = sc.nextInt(), Count = 0;
		
		int n = num;
	
		do {
			Count++;
			num /= 10;
		} while(num != 0);
		
		System.out.println("The value is " + n + " Count is " + Count);
	
		sc.close();
	}
}
