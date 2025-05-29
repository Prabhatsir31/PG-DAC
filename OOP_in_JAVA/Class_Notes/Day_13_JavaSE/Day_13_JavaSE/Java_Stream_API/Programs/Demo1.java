import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1
{
private static int sumIterator(List<Integer> list) 
{
    Iterator<Integer> it = list.iterator();
    int sum = 0;
    while (it.hasNext()) 
    {
        int num = it.next();
        if (num > 10) 
        {
            sum += num;
        }
    }
    return sum;
}
public static void main(String args[])
{
	List<Integer> mylist=new ArrayList<Integer>();
	mylist.add(4);
	mylist.add(12);
	mylist.add(3);
	mylist.add(20);
	int result=sumIterator(mylist);
	System.out.println(result);
}
}

