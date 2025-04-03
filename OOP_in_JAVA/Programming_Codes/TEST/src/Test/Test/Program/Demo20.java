class A{}  
class B extends A{}

class base
{
	A disp()
	{
		System.out.println("base disp");
		return null;
	}
}
class sub1 extends base     
{
	A disp()   // same return type
	{
		System.out.println("sub disp");
		return null;
	}
}
public class Demo20
{
	public static void main(String args[])
	{
		sub1 s1=new sub1(); 
		s1.disp();
	}
}