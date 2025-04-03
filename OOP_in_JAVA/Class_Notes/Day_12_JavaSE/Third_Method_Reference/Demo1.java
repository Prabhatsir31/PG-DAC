package core1;

interface Emp
{
	void mymethod();
}
class Sample
{
	void disp()
	{
		System.out.println("in Sample disp");
	}
}
public class Demo1
{
	public static void main(String args[])
	{
		
		Sample s1=new Sample();
		// using lambda
		Emp ref1=()->{ s1.disp();};
System.out.println("Implementation classname is\t"+ref1.getClass().getName());
		ref1.mymethod();

	// using method reference
		Emp ref2=s1::disp;
System.out.println("Implementation classname is\t"+ref2.getClass().getName());
		ref2.mymethod();
		
	}
}
		
		
		
		



