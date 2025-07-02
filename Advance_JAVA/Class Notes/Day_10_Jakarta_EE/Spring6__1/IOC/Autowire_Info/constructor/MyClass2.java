package mypack;

public class MyClass2 
{
	MyClass1 ob1;
	
	public MyClass2(MyClass1 ob1) {
		
		this.ob1 = ob1;
		System.out.println("in MyClass2 1 param constr taking MyClass1");
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
