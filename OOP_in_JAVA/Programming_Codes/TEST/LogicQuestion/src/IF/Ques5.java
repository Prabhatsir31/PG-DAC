package IF;

import java.util.Scanner;

//Accept a number from user check if it is odd or even without using (modular)% operator.
public class Ques5 {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter the number: ");
	
		int num = sc.nextInt();
		
		System.out.println((num & 1) == 0 ? "Even" : "Odd");
		
		sc.close();
	}
}
