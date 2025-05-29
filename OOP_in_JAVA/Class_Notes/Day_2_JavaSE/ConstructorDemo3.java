class Sample
{
	// constructor overloading

	Sample()
	{
		System.out.println("inside default constructor");
	}
	
	Sample(int num)
	{
		this.num=num;
		System.out.println("inside parameterized constructor");
	}

	private int num;
	
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
}
public class ConstructorDemo3
{
	public static void main(String args[])
	{
		Sample s1=new Sample();  // will invoke "default constructor" provided by compiler
		s1.setNum(200);
		System.out.println(s1.getNum());

		Sample s2=new Sample(100);  // will invoke "parameterized constructor"
		System.out.println(s2.getNum());
	}
}