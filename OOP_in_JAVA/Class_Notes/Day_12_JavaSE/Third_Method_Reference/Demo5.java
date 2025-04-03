package core1;
interface Emp
{
	void mymethod(int k);
}
class Sample
{
	public Sample(int k)
	{
		System.out.println("inside Sample param\t"+k);
	}
}
public class Demo5
{
	public static void main(String args[])
	{
		// using lambda
		Emp ref1=(n)->{ new Sample(n);};
System.out.println("Implementation classname is\t"+ref1.getClass().getName());
		ref1.mymethod(50);
		// using method reference
		Emp ref2=Sample::new;
System.out.println("Implementation classname is\t"+ref2.getClass().getName());
		ref2.mymethod(80);
		
	}
}
		
		
		
		



