package LOOP;

import java.util.Scanner;

//Accept term from user and print Fibonacci series

public class Ques9 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt(), a = 0, b = 1;
		
		for(int i = 1; i <= n; i++) {
			System.out.print(a + " ");
			int temp = b;
			b = a + b;
			a = temp;
		}		
		sc.close();
	}
}
