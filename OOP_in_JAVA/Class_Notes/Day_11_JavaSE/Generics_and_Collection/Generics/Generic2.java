import static java.lang.System.*;
public class Generic2<W>
{
	private W first;
	Generic2()
	{
	}
	Generic2(W first)
	{
		this.first=first;
	}
	void setVal(W first)
	{
		this.first=first;
	}
	static void fun()
	{
		out.println("in fun static");
	}		
	W getVal()
	{
		return first;
	}
	public static void main(String args[])
	{
		Generic2<String> g1=new Generic2<String>();
		g1.setVal("Hello Generic");
		out.println(g1.getVal());

		Generic2<Integer> g2=new Generic2<Integer>(1000);
		out.println(g2.getVal());		

		Generic2<Boolean> g3=new Generic2<Boolean>();
		g3.setVal(true);
		out.println(g3.getVal());

		Generic2.fun();
		
	}
}