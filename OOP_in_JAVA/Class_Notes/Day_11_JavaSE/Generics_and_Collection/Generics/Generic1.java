import static java.lang.System.*;
public class Generic1<T>
{
	private T first;
	void setVal(T first)
	{
		this.first=first;
	}
	T getVal()
	{
		return first;
	}
	public static void main(String args[])
	{
		Generic1<String> g1=new Generic1<String>();
		g1.setVal("Hello Generic");
		out.println(g1.getVal());

		Generic1<Integer> g2=new Generic1<Integer>();
		g2.setVal(420);
		out.println(g2.getVal());		

		Generic1<Boolean> g3=new Generic1<Boolean>();
		g3.setVal(true);
		out.println(g3.getVal());
		
	}
}





