/*
Catching multiple exceptions in a single catch block reduces code duplication and increases efficiency.

The bytecode generated while compiling this program will be smaller than the program having multiple catch blocks as there is no code redundancy.
*/

package firstpro;


public class Demo1 
{
	public static void main(String[] args) 
	{
		try {
		      int array[] = new int[10];
		      array[10] = 30 / 0;
		    } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
		      System.out.println(e.getMessage());
		    }
		
	}

}

/*
output:

/ by zero

*/
