class base
{
	void disp()
	{
		System.out.println("base disp");
	}
}
class sub1 extends base     
{
	void disp()     
	{
		System.out.println("sub1 disp");
	}
}
public class Demo28
{
	public static void main(String args[])
	{
		base ref1=new sub1(); //upcasting 
		sub1 s1=(sub1)ref1; //downcasting
		System.out.println("first test over");

		base ref2=new base(); // no upcasting
		sub1 s2=(sub1)ref2;  // downcasting
		System.out.println("second test over");
	}
}













