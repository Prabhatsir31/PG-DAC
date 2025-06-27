package mypack;

import org.springframework.stereotype.Component;

@Component(value="sample")
public class Sample 
{
	public void disp1()
	{
		System.out.println("inside disp1 method");
	}
	void disp2()
	{
		System.out.println("inside disp2 method");
	}
	void disp3()
	{
		System.out.println("inside disp3 method");
	}
}
