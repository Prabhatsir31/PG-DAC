interface emp1
{
	void disp1();
}

public class Demo7 
{
	int num=100;
	
emp1 ref1=()->{System.out.println("in disp1 of implentation");
System.out.println("value of num is\t"+this.num);
};
	public static void main(String args[])
	{
		Demo7 d=new Demo7();
		d.ref1.disp1();
System.out.println("Implementation class name is\t"+d.ref1.getClass().getName()); 

	}
}
