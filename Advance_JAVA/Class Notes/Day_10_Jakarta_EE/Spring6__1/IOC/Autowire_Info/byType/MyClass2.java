package mypack;

public class MyClass2 
{
	MyClass1 ob1;
	public MyClass1 getOb1() {
		return ob1;
	}
	public void setOb1(MyClass1 ob1) {
		System.out.println("in setOb of MyClass2");
		this.ob1 = ob1;
	}
	public MyClass2() {
		System.out.println("in MyClass2 no-arg");
	}
	void disp()
	{
		System.out.println("in MyClass2 disp");
		ob1.print();
	}
}
