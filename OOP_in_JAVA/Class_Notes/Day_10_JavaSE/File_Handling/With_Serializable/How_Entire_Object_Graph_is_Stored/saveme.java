import java.io.*;
class Part implements Serializable
{
	int val;
	public Part()
	{
		System.out.println("in Part constructor");
	}
	public void setVal(int val)
	{
		this.val=val;
	}
	public int getVal()
	{
		return val;
	}
	
}
class base implements Serializable
{
	private int var;
	
	public base()
	{
		System.out.println("in base constructor");
	}
	public void setVar(int var)
	{
		this.var=var;
	}
	public int getVar()
	{
		return var;
	}
}
public class saveme extends base 
{
	int num;
	private Part part=new Part();
	public saveme()
	{
		System.out.println("in saveme const");
		
	}
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
	public Part getPart()
	{
		return part;
	}
	
  
}