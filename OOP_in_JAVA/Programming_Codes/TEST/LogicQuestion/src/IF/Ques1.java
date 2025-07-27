package IF;

import java.util.Scanner;

//Swap 2 variable without using 3rd variable.(three answer)
public class Ques1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Two number number : ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Num1 : " + num1 + " Num2 : " + num2);
		System.out.println("After Swapping");
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("Num1 : " + num1 + " Num2 : " + num2);
		
		sc.close();
	}
}
