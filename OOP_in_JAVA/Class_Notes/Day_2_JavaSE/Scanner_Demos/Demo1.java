package firstpro;

import java.util.Scanner;

public class Demo1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("Number accepted is\t"+num);
		
		System.out.println("Enter amount");
		double amount=sc.nextDouble();
		System.out.println("Amount accepted is\t"+amount);
		
		System.out.println("Enter login name");
		String loginname=sc.next();
		System.out.println("Login name accepted is\t"+loginname);
		
		System.out.println("Enter full name");
		String fullname=sc.nextLine();
		System.out.println("Full name accepted is\t"+fullname);
	}

}


/*

output:

Enter a number
100
Number accepted is	100
Enter amount
15000.45
Amount accepted is	15000.45
Enter login name
scott
Login name accepted is	scott
Enter full name
Full name accepted is	
*/

// So that means it does not take "fullname"

/*

It happens because the Scanner.next() or nextFoo() methods do not read the newline character in your input created by hitting "Enter," and so the call to Scanner.nextLine() returns after reading that newline not read by previous next() or nextFoo() methods.

*/