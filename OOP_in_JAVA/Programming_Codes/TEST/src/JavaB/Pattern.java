package JavaB;

import java.util.Scanner;

public class Pattern {
	public static void main(String args[]) {

		int i, j;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int row1 = scanner.nextInt();

		
		for(i = 0; i< row1; i++) {
			for(j = 0; j<= i; j++) { 
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
