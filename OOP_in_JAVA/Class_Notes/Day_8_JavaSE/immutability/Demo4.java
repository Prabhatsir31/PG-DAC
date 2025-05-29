// 3.if necessary, create copies to avoid returning the originals in your methods
 

class MyClass implements Cloneable
{
	private int data;
	public MyClass(int data)
	{
		this.data=data;
	}
	public void setData(int data)
	{
		this.data=data;
	}
	public int getData()
	{
		return data;
	}
	public MyClass clone()throws CloneNotSupportedException
	{
		return ((MyClass)super.clone());
	}
}
class base
{
	private int num;
	private MyClass ref=new MyClass(25);
	public base(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
	public void dispRef()
	{
		System.out.println(ref.getData());
	}
	public MyClass getRef()throws CloneNotSupportedException
	{
		return ref.clone();
	}
	
}
public class Demo4
{
	public static void main(String args[])throws CloneNotSupportedException
	{
		base b1=new base(100);
		System.out.println(b1.getNum());
		b1.dispRef();
		MyClass ref=b1.getRef(); // No problem,as getRef returns copy of mutable object
		ref.setData(-3);  
		b1.dispRef();
	}
}