// mymethod and disp arguments must match

package core1;

interface Emp
{
	void mymethod(int k);
}
class Sample
{
	void disp1(int k)
	{
		System.out.println("in Sample disp1\t"+k);
	}
	void disp2(int k)
	{
		System.out.println("in Sample disp2\t"+k);
	}
}
public class Demo2_a
{
	public static void main(String args[])
	{
		
		Sample s1=new Sample();
		// using lambda
		Emp ref1=(n)->{ s1.disp1(n); s1.disp2(n); };
		System.out.println("Implementation classname is\t"+ref1.getClass().getName());
		ref1.mymethod(100);
		// using method reference
		Emp ref2=s1::disp1;
		System.out.println("Implementation classname is\t"+ref2.getClass().getName());
		ref2.mymethod(200);
		ref2=s1::disp2;
		System.out.println("Implementation classname is\t"+ref2.getClass().getName());
		ref2.mymethod(300);
		
	}
}
		
		
		
		



