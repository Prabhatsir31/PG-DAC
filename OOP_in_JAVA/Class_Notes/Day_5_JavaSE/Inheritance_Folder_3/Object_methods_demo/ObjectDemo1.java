class MyNum
{
	int num;
	MyNum(int num)
	{
		this.num=num;
	}
}
public class ObjectDemo1
{
	public static void main(String args[])
	{
		MyNum m1=new MyNum(100);
		MyNum m2=new MyNum(100);
	
		System.out.println(m1.toString());
		System.out.println(m2);
		
		if(m1.equals(m2))
		{
			System.out.println("m1 and m2 are equals");
		}
		else
		{
			System.out.println("m1 and m2 are not equals");
		}

		if(m1==m2)
		{
			System.out.println("m1 and m2 are ==");
		}
		else
		{
			System.out.println("m1 and m2 are not ==");
		}

		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
	}
}
	