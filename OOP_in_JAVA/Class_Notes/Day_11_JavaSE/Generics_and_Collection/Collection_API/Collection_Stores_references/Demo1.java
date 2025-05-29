import java.util.*;
class myclass
{
	int num;
	myclass(int num)
	{
		this.num=num;
	}
}
public class Demo1
{
	public static void main(String args[])
	{
		Map<String,myclass>h=new HashMap<String,myclass>();
		
		myclass m1=new myclass(100);
		System.out.println(m1.num);  // 100
		h.put("first",m1);
		
		m1.num=200;

		System.out.println(m1.num);  // 200

		myclass ref=h.get("first");

		System.out.println(ref.num); // 200
	}
}
