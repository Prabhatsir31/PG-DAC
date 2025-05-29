interface emp1
{
	void disp1();  // public and abstract
}
interface emp2
{
	void disp2();
}
class sub1 implements emp1,emp2
{
	public void disp1()
	{
		System.out.println("sub1 disp1");
	}
	public void disp2()
	{
		System.out.println("sub1 disp2");
	}
}
public class Demo34
{
	public static void main(String args[])
	{
		sub1 s1=new sub1();
		s1.disp1();
		s1.disp2();

	}
}