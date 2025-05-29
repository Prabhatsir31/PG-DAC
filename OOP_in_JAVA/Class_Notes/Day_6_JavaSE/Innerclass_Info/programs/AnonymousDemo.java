interface emp
{
	void disp();
}
public class AnonymousDemo
{
	static emp getEmp()
	{
		return new emp()
		{
			public void disp()
			{
				System.out.println("in disp");
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
	}
}		