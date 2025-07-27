package IF;

import java.util.Scanner;

//Accept a number from user check if it is odd or even number.
public class Ques4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		
		int num = sc.nextInt();
		
		if(num == 0 | num < 0) {
			System.out.println("Give me the number grater than Zero");
		} else if(num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		
		sc.close();
	}
}
