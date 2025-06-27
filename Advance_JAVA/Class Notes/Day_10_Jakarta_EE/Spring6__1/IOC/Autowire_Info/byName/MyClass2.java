package mypack;

public class MyClass2 
{
	MyClass1 ob;
	public MyClass1 getOb() {
		return ob;
	}
	public void setOb(MyClass1 ob) {
		System.out.println("in setOb of MyClass2");
		this.ob = ob;
	}
	public MyClass2() {
		System.out.println("in MyClass2 no-arg");
	}
	void disp()
	{
		System.out.println("in MyClass2 disp");
		ob.print();
	}
}
