public class MyClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Short a=Short.valueOf((short)127);
		Short b=Short.valueOf((short)127);
		if(a==b)
		{
			System.out.println("a and b are ==");
		}
		else
		{
			System.out.println("a and b are not ==");
		}

		if(a.equals(b))
		{
			System.out.println("a and b are equals");
		}
		else
		{
			System.out.println("a and b are not equals");
		}
		
System.out.println("Now Using value outside the range");
		Short c=Short.valueOf((short)128);
		Short d=Short.valueOf((short)128);
		if(c==d)
		{
			System.out.println("c and d are ==");
		}
		else
		{
			System.out.println("c and d are not ==");
		}

		if(c.equals(d))
		{
			System.out.println("c and d are equals");
		}
		else
		{
			System.out.println("c and d are not equals");
		}

	}

}
