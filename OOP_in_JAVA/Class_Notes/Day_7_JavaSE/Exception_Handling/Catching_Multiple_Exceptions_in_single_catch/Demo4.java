/*If the base exception class has already been specified in the 
catch block, do not use child exception classes in the 
same catch block. Otherwise, we will get a compilation error.*/

package firstpro;


public class Demo4 
{
	public static void main(String[] args) 
	{
		try {
		      int array[] = new int[10];
		      array[10] = 30 / 5;
		    } catch (Exception | ArithmeticException e) // error
			{
		      e.printStackTrace();
		    }
		System.out.println("Done");
		
	}

}
