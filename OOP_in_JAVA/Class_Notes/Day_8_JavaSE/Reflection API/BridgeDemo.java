import java.lang.reflect.*;
class base
{
	Object disp()
	{
		System.out.println("in base disp");
		return null;
	}
}
class sub extends base
{
	String disp()
	{
		System.out.println("in sub disp");
		return null;
	}
}
public class BridgeDemo
{
	public static void main(String args[])
	{
		base ref=new sub();
		ref.disp();
		try
		{
		Class c=Class.forName("sub");
		Method arr[]=c.getDeclaredMethods();
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			System.out.println(arr[i].isBridge());
		}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}