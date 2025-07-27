package IF;

import java.util.Scanner;

//Accept a number from user, if it is divisible by 3 print “three”, if it is divisible by 7 print “seven” 
//and if it is divisible by both (3 &7) print “three-seven”.

public class Ques3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		
		int num = sc.nextInt();
		
		if(num % 3 == 0 | num % 7 == 0) {
			System.out.println("Three-Seven");
		} else if (num % 3 == 0) {
			System.out.println("Three");
		} else if (num % 7 == 0) {
			System.out.println("Seven");
		} else {
			System.out.println("The number is not divisible by 3 and 7");
		}
		
		sc.close();
	}
}
