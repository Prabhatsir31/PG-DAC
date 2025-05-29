package JavaB;
import java.util.*;

public class Fabonacci {
	public static void main(String args[]) {
		int n1=0, n2=1, n3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int count = scanner.nextInt();
		
		System.out.println(n1 + " " + n2);
		for(int i = 2; i< count; i++)
		{
			n3 = n1 + n2;
			System.out.println(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
