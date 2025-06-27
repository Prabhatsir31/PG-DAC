package mypack;
public class ProductImpl implements Product 
{
	public int multiply(int a, int b) 
	{
        return a*b;
	}

	@Override
	public void display() {
		System.out.println("Inside display method");
		
	}

}
