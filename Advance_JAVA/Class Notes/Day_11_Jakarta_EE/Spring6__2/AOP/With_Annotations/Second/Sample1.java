package mypack;

import org.springframework.stereotype.Component;

@Component(value="sample1")
public class Sample1 
{
	void fun1()
	{
		System.out.println("in fun1");
	}
	public void fun2()
	{
		System.out.println("in fun2");
	}
}
