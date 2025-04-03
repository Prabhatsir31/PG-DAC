public class WrapperDemo3
{
	public static void main(String args[])
	{
		//  jdk5 onwards
		// convert int to Integer

		int num=5;
		Integer ob1=num;   // autoboxing [ assigning primitive to wrapper ]
		System.out.println(ob1);  // 5

		// convert Integer to int

		int k=ob1;      // unboxing  [ assigning wrapper to primitive ]
		System.out.println(k);  // 5
	}
}

/*

autoboxing and unboxing concepts are only till compile time. When u compile the code, compiler converts autoboxing and unboxing code into the old code. It is because JVM doesn't understand autoboxing and unboxing.
i.e. in the above code when u say :
	Integer ob1=num;
compiler converts into

	Integer ob1=new Integer(num);

and when you say :
	int k=ob1;
compiler converts into
	int k=ob1.intValue();

conclusion: autoboxing and unboxing are only syntactical sugar.

*/





