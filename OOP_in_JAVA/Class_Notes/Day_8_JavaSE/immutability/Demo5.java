

// A subclass cannot actually modify the values of private properties in its parent, but it could behave as though it has
 
class base  // immutable class
{
	private int num;
	public base(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
}
class sub extends base   // mutable class
{
	private int num;
	public sub(int num)
	{
		super(0);
		this.num=num;
	}
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
}

public class Demo5
{
	static void showBaseData(base ref) // defined only for base class
	{
		/*
		 one can write following code if child of base is allowed
		*/
		if(ref instanceof sub)
		{
			((sub)ref).setNum(((sub)ref).getNum()+10);
		}
		System.out.println("Value of base num is\t"+ref.getNum());
	}		

	public static void main(String args[])
	{
		base ref1=new base(100);
		showBaseData(ref1); 
		base ref2=new sub(200);  // possible,if child of base is allowed
		showBaseData(ref2);
		
	}
}
/*
to avoid above problem,
Ensure that the class can't be extended. This prevents careless or malicious subclasses from compromising the immutable behavior of the class by behaving as if the object's state has changed.
*/

