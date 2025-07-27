package IF;

import java.util.*;

//Accept three numbers and find out the highest number.
public class Ques2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the three number: ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3); 
		
		System.out.println("Highest Number : " + max);
		
		sc.close();
	}
}
