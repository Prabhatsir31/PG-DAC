public class MyClass2
{
	int num=100;
	void disp()
	{
		System.out.println(this.num);
	}
	public static void main(String args[])
	{
		MyClass2 m1=new MyClass2();
			
		m1.disp();
		m1=null;		
		if(m1!=null)
		{
			m1.disp();
		}
		
	}
}





