class base
{
	static void disp(int k)
	{
		System.out.println("base disp");
	}
}
class sub extends base
{
	static void disp()  
	{
		System.out.println("sub disp");
	}
}
public class Demo4
{
	public static void main(String args[])
	{
		sub s=new sub();
		s.disp();

/* what compiler does

 sub.disp();

*/
	}
}