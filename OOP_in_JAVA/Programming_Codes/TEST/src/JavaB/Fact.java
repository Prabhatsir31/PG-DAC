package JavaB;
import java.util.*;

public class Fact {
	public static void main(String args[]) {
		int i, fact = 1;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int num = scanner.nextInt();
		
		for(i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is " + fact );
	}
}
