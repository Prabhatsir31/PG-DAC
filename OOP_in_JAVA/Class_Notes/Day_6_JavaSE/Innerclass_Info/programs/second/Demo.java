class Outer
{
	private int num1=10;
	int num2=20;
	protected int num3=30;
	public int num4=40;
	
	static int num5=50;

	static
	{
		System.out.println("in Outer static block");
	}
	
	void outerDisp()
	{
		System.out.println(num1+"\t"+num2+"\t"+num3+"\t"+num4);
	}

	static class inner
	{
		void innerDisp()
		{
			System.out.println(num5);
		}
		static
		{
			System.out.println("in inner static block");
		}
	}
}

public class Demo
{
	public static void main(String args[])
	{
		System.out.println("before creating Outer object");
		Outer o1=new Outer();
System.out.println("before creating inner object");

		Outer.inner i=new Outer.inner();
		
		o1.outerDisp();
		i.innerDisp();
	}
}