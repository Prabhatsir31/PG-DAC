package LOOP;

import java.util.Scanner;

//Accept 10 numbers from user and print highest and 2nd highest number.

public class Ques12 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 10 number : ");
		
		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
		
		for(int i = 1; i <= 10; i++) {
			int n = sc.nextInt();
			if(n > max1) {
				max2 = max1;
				max1 = n;
			}	else if (n > max2 && n != max1) {
                max2 = n;
            } 
		}
		System.out.println("Highest: " + max1);
		System.out.println("2nd Highest: " + max2);
		
		sc.close();
	}
}
