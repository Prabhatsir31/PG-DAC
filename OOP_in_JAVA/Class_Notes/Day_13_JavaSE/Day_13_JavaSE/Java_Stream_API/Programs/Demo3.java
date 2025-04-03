import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo3
{
	public static void main(String ...arg)
	{
		List<String> stringCollection = new ArrayList<>();
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("bbb1");
		stringCollection.add("aaa1");
		stringCollection.add("bbb3");
		stringCollection.add("ccc");
		stringCollection.add("bbb2");
		stringCollection.add("ddd1");

			stringCollection.stream().filter((s) -> s.startsWith("a")).forEach(System.out::println);

		System.out.println(stringCollection.stream().filter((s) -> s.startsWith("a")).count());

	}
}
