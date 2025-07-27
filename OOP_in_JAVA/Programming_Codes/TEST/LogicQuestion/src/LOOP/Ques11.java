package LOOP;

import java.util.Scanner;

//Accept 10 numbers from user and print lowest number.

public class Ques11 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 10 number : ");
		
		int min = Integer.MAX_VALUE;
		
		for(int i = 1; i <= 10; i++) {
			int n = sc.nextInt();
			if(n < min) {
				min = n;
			}	 
		}
		System.out.println("Lowest: " + min);
		
		sc.close();
	}
}
