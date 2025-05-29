import java.util.ArrayList;
import java.util.List;

public class Demo2
{
private static int sumIterator(List<Integer> list) 
{
	return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
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


