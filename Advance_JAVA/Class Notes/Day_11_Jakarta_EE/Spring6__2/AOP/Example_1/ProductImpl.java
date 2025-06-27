package mypack;
public class ProductImpl implements Product
{
    public int multiply(int a, int b)
    {
    	System.out.println("inside multiply");
        return a*b;
    }
}
