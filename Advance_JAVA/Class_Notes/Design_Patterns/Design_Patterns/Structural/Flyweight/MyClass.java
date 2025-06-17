public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a=Integer.valueOf(-12);
		Integer b=Integer.valueOf(-12);
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
		Integer c=Integer.valueOf(128);
		Integer d=Integer.valueOf(128);
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
