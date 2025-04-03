package firstpro;


public class Demo2 
{
	public static void main(String[] args) 
	{
		try {
		      int array[] = new int[10];
		      array[10] = 30 / 5;
		    } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
		      e.printStackTrace();
		    }
		
	}

}

/*
output:

java.lang.ArrayIndexOutOfBoundsException: 10
	at firstpro.Demo2.main(Demo2.java:10)

Done

*/