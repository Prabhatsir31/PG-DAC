package core;

import java.io.*;
class Base implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1000;
	int data=200;
}
public class First extends Base 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2000;
	String name="sachin";
	int age=20;
	transient Thread t=new Thread();
}
