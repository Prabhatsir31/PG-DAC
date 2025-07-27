package LOOP;

import java.util.Scanner;

//Accept 10 numbers from user and print highest number

public class Ques10 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 10 number : ");
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 1; i <= 10; i++) {
			int n = sc.nextInt();
			if(n > max) {
				max = n;
			}	 
		}
		System.out.println("Highest: " + max);
		
		sc.close();
	}
}
