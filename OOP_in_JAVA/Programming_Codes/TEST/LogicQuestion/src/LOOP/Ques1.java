package LOOP;

import java.util.Scanner;

//Accept 10 numbers from user and do sum of it.(do not use array)

public class Ques1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 10 number: "); 
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += sc.nextInt();
		}
		System.out.println("Sum : " + sum); 
		
		sc.close();
	}
}
