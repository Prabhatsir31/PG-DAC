class A
{
	public String toString()
	{
		return "My Name is\t"+getClass().getName();
	}
}
class B
{
	public String toString()
	{
		return "My Name is\t"+getClass().getName();
	}
}
class C
{
	public String toString()
	{
		return "My Name is\t"+getClass().getName();
	}
}
class D
{
	public String toString()
	{
		return "My Name is\t"+getClass().getName();
	}
}
public class Demo2 
{
	void disp(Object ...col)
	{
		for(int i=0;i<col.length;i++)
		{
			System.out.println(col[i]);
		}
		System.out.println("Using foreach loop");
		for(Object ref:col)
		{
			System.out.println(ref);
		}
	}
	public static void main(String args[])
	{
		A ob1=new A();
		B ob2=new B();
		C ob3=new C();
		D ob4=new D();
		new Demo2().disp(ob1,ob2,ob3,ob4);
	}
}
