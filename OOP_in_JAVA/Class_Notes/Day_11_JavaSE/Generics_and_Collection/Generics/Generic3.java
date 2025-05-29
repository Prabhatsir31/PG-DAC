import static java.lang.System.*;
import java.util.*;
class shape
{
	shape draw()
	{
		return this;
	}
}
class triangle extends shape
{
	shape draw()
	{
		return this;
	}
}
class rect extends shape
{
	shape draw()
	{
		return this;
	}
}
class common<T extends shape>
{
	T ob;
	public common(T ob)
	{
		this.ob=ob;
	}
	public T fun()
	{
		return ob;
	}
}
public class Generic3
{
	
	public static void main(String args[])
	{
		common<rect> c1=new common<rect>(new rect());
		rect r=c1.fun();
		out.println("in main   "+r);

		common<triangle> c2=new common<triangle>(new triangle());
		triangle t=c2.fun();
		out.println("in main   "+t);
	
	}
}







