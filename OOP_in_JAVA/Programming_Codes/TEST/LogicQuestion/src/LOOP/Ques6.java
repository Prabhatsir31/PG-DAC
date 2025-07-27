package LOOP;

//Accept a number from user and check if it is palindrome number or not eg (121)

public class Ques6 {
	public static void main(String args[]) {			
		int num = 121, rev = 0;
		
		while(num > 0) {
			rev = rev * 10 + (num % 10);
			num /= 10;
		}
	
		System.out.println("Palindrome : " + rev);
	}
}
