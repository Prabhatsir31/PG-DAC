//package firstpro;

import java.util.Scanner;

public class Demo2 
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
		sc.nextLine();  // this is to read newline not read by previous
						// next() or nextFoo() methods
		System.out.println("Enter full name");
		String fullname=sc.nextLine();
		System.out.println("Full name accepted is\t"+fullname);
	}

}
