package core1;
interface Emp
{
	void mymethod();
}
class Sample
{
	public Sample()
	{
		System.out.println("inside Sample no-arg");
	}
}
public class Demo4
{
	public static void main(String args[])
	{
		// using lambda
		Emp ref1=()->{ new Sample();};
System.out.println("Implementation classname is\t"+ref1.getClass().getName());
		ref1.mymethod();
		// using method reference
		Emp ref2=Sample::new;
System.out.println("Implementation classname is\t"+ref2.getClass().getName());
		ref2.mymethod();
		
	}
}
		
		
		
		



