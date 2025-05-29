/*8) Define a class "base1" with only parameterized constructor.
Derive a class "sub1" from "base1". This class should have following constructors
	a) Default
	b) one parameter
	c) two parameter
Now try to instantiate "sub1" , using any of the above mentioned constructors. */

class base1
{
	int num=10;
	base1(int num)
	{
		this.num=num;
		System.out.println("In base1");
		System.out.println(num);
	}
}

class sub1 extends base1
{
	int num1=12;
	int num2=45;
	sub1()
	{
		super(20);
		
		System.out.println("In default sub");
	}
	
	sub(int num1)
	{
		super(14);
		this.num1=num1;
		System.out.println("In 1 para sub");
		System.out.println(num1);
	}
	sub(int num1,int num2)
	{
		super(14);
		this.num1=num1;
		this.num2=num2;
		System.out.println("In 2 para sub");
		System.out.println(num1+" "+num2);
	}
}

class Assign5
{
	public static void main(String args[])
	{
		base1 s1=new sub1(34);
		
	}
}
