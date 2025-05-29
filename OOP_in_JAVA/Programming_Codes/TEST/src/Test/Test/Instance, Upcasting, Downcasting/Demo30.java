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
public class Demo30
{
	public static void main(String args[])
	{
		base ref1=new sub1(); //upcasting 
		if(ref1 instanceof sub1)
		{
			sub1 s1=(sub1)ref1;		
		}
		else
		{
			System.out.println("can not convert to s1");
		}
		System.out.println("first test over");
		base ref2=new base();
		if(ref2 instanceof sub1)
		{
			sub1 s2=(sub1)ref2;		
		}
		else
		{
			System.out.println("can not convert to s2");
		}
		System.out.println("second test over");
	}
}