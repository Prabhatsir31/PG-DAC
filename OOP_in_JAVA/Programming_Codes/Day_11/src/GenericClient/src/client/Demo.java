package client;

import pack1.Generic;

public class Demo 
{
	public static void main(String[] args) 
	{
		Generic<String> g1=new Generic<>();
		g1.setFirst("Hello World");
		System.out.println(g1.getFirst());
		
		Generic<Integer> g2=new Generic<>();
		g2.setFirst(10);
		System.out.println(g2.getFirst());
		
		Generic<Boolean> g3=new Generic<>();
		g3.setFirst(true);
		System.out.println(g3.getFirst());
		
		
	}

}
