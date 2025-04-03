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
public class Demo29
{
	public static void main(String args[])
	{
		base ref1=new sub1(); //upcasting 
		if(ref1 instanceof base)
		{
			System.out.println("it is base");
		}
		if(ref1 instanceof sub1)
		{
			System.out.println("it is sub1");
		}

		base ref2=new base();
		if(ref2 instanceof base)
		{
			System.out.println("it is base");
		}
		if(ref2 instanceof sub1)
		{
			System.out.println("it is sub1");
		}

		//base ref2=new base(); // no upcasting
		//sub1 s2=(sub1)ref2;  // downcasting
		System.out.println("second test over");
	}
}