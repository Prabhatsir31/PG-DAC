//package optional_pro;

import java.util.Optional;

class MyClass
{
	public String disp()
	{
		return "in disp of MyClass";
	}
}
public class Demo1 {
	//private static MyClass ref=new MyClass();
	 private static MyClass ref;
	
	public static MyClass getMyClass()
	{
		return ref;
	}
	public static void main(String[] args)
	{

		Optional<MyClass> op=Optional.ofNullable(getMyClass());
		System.out.println(op); // contains the object returned by "getMyClass"
		
		op.ifPresent(k->System.out.println(k.disp()));

	}

}
