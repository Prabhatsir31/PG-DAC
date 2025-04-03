class base
{
	public void disp()
	{
		System.out.println("base disp");
	}
}
class sub1 extends base     
{
	/*void disp()     // error
	{
		System.out.println("sub disp");
	}*/
	/*protected void disp()    // error
	{
		System.out.println("sub disp");
	}*/
	public void disp()   
	{
		System.out.println("sub disp");
	}
}
public class Demo24
{
	public static void main(String args[])
	{
		sub1 s1=new sub1(); 
		s1.disp();
	}
}