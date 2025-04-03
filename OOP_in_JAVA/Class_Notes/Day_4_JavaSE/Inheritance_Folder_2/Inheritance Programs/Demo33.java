interface emp1
{
	void disp1();  // public and abstract
}
class sub1 implements emp1
{
	/*public*/ void disp1()
	{
		System.out.println("sub1 disp1");
	}
}
public class Demo33
{
	public static void main(String args[])
	{
		sub1 s1=new sub1();
		s1.disp1();

	}
}