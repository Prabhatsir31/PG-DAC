public class MyClass
{
	@Override
	protected void finalize()
	{
		System.out.println("in finalize method");
	}
	public static void main(String args[])
	{
		System.out.println("in main");
		MyClass m=new MyClass();
		m=null;
		System.gc();
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello\t"+i);
		}
		System.out.println("done");
	}
}