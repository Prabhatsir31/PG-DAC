package mypack;

import java.beans.ConstructorProperties;

public class InjectSetter
{
    public InjectSetter() {
			System.out.println("Inside InjectSetter no-arg constructor");
	}
	private String message=null;
    	private int num;

    public void setMessage(String message) 
    {
        System.out.println("in setMessage method");
        this.message = message;
    }

    public void setNum(int num) 
    {
        System.out.println("in setNum method");
        this.num = num;
    }
    public String getMessage() {
        return message;
    }
    public int getNum() {
        return num;
    }
}







