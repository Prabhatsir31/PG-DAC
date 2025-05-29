// before jdk1.5
public class WrapperDemo5
{
	public static void main(String args[])
	{
		int num=100;

		// converting primitive to wrapper
		Integer ob=new Integer(num);

		

		// converting wrapper to primitive

		int k=ob.intValue();
		System.out.println(k);
	}
}
	