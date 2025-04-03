// mymethod and disp arguments must match

//package core1;

interface Emp
{
	void mymethod(int k);
}
class Sample
{
	int disp(int k)
	{
		return k*k;
	}
}
public class Demo2_b
{
	public static void main(String args[])
	{
		
		Sample s1=new Sample();
		// using lambda
		Emp ref1=(n)->{ System.out.println(s1.disp(n));};
System.out.println("Implementation classname is\t"+ref1.getClass().getName());
		ref1.mymethod(100);
		// using method reference
		Emp ref2=s1::disp;
System.out.println("Implementation classname is\t"+ref2.getClass().getName());
		ref2.mymethod(200);
		
	}
}
		
		
		
		



