package core1;

interface emp1
{
	void disp(int k);
}
public class Demo7
{
	public static void main(String[] args)
	{
		
		// using lambda
		emp1 ref1=(k)->{System.out.println(k);};
System.out.println("Implementation classname is\t"+ref1.getClass().getName());
		ref1.disp(200);
		
		// using method reference
		
		emp1 ref2=System.out::println;
System.out.println("Implementation classname is\t"+ref2.getClass().getName());
		ref2.disp(300);

	}

}













