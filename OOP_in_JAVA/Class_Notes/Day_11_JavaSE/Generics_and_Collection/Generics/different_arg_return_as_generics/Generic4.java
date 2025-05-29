class a{}
class b extends a{}
class MyClass
{
	<T>void accept(T t)
	{
		System.out.println(t);
	}	
	public<T extends a,B>B disp(T t,B ref)
	{
		System.out.println(t);
		return ref;
	}
}
public class Generic4
{
	public static void main(String args[])
	{
		MyClass m1=new MyClass();
		m1.accept(20);
		m1.accept(m1);
		Generic4 tr=new Generic4();
		m1.accept(tr);

		b ob=new b();
		m1.disp(ob,tr);
		// m1.disp(tr); Error
	}
}



