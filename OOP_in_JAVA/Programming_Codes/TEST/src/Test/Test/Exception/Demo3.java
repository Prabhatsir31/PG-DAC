/*If the base exception class has already been specified in the 
catch block, do not use child exception classes in the 
same catch block. Otherwise, we will get a compilation error.*/

public class Demo3 {
	public static void main(String[] args) {
		try {
			int array[] = new int[10];
			array[10] = 30 / 5;
		} catch (ArithmeticException | Exception e) // Error
		{
			e.printStackTrace();
		}
		System.out.println("Done");

	}

}
