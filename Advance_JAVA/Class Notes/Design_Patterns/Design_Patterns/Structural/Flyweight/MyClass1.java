public class MyClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Long a=Long.valueOf(127);
		Long b=Long.valueOf(127);
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
		Long c=Long.valueOf(128);
		Long d=Long.valueOf(128);
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
