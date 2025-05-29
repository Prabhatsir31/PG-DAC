import static java.lang.System.*;
interface shape
{
	void draw();
	
}
class triangle implements shape
{
	public void draw()
	{
		out.println("in draw of triangle");
	}
}
class rect implements shape
{
	public void draw()
	{
		out.println("in draw of rect");
	}
}
class common<T extends shape>
{
	T ob;
	public common(T ob)
	{
		this.ob=ob;
	}
	public void fun()
	{
		ob.draw();
	}
}
public class Generic3a
{
	
	public static void main(String args[])
	{
		common<rect> c1=new common<rect>(new rect());
		c1.fun();

		common<triangle> c2=new common<triangle>(new triangle());
		c2.fun();
	}
}








