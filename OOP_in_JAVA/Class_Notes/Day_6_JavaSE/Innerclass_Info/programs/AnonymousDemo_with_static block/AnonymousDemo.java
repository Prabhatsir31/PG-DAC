interface emp
{
	void disp();
}
public class AnonymousDemo
{
			static
			{
				System.out.println("in AnonymousDemo static block");
			}
	static emp getEmp()
	{
		return new emp()
		{
			public void disp()
			{
				System.out.println("in disp");
			}
			static
			{
				System.out.println("in anonymous class static block");
			}
		};
	}
	/*static emp getEmp()
	{
		emp e=new emp()
		{
			public void disp()
			{
				System.out.println("in disp diff way");
			}
		};
		return e;
	}*/
	public static void main(String args[])
	{
		emp e1=AnonymousDemo.getEmp();
		e1.disp();
		emp e2=AnonymousDemo.getEmp();
		e2.disp();
	}
}		