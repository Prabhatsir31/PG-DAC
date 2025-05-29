// mymethod and disp arguments must match

package core1;

interface Emp
{
	void mymethod(int k);
}
class Sample
{
	static void disp(int k)
	{
		System.out.println("in Sample disp static \t"+k);
	}
}
public class Demo3
{
	public static void main(String args[])
	{
		// using lambda
		Emp ref1=(n)->{ Sample.disp(n);};
System.out.println("Implementation classname is\t"+ref1.getClass().getName());
		ref1.mymethod(100);
		// using method reference
		Emp ref2=Sample::disp;
System.out.println("Implementation classname is\t"+ref2.getClass().getName());
		ref2.mymethod(200);
		
	}
}
		
		
		
		



