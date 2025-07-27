package LOOP;

import java.util.Scanner;

//Accept a number from user and do sum of digit

public class Ques3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		
		int num = sc.nextInt(), sum = 0;
		
		int n = num;
		
		while(num > 0) {
			sum += (num % 10);
			num /= 10;
		}	
		System.out.println("Value is " + n + " and the Sum of digit is " + sum);
	
		sc.close();
	}
}
