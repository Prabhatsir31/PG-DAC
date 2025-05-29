import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class PeekExample2 
{

	private static void someCustomOperation(int n) 
	{
	        System.out.println("Custom operation on: " + n*2);
	}

	public static void main(String args[])
	{
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Create a stream and use peek to inspect elements
		List<Integer> numbers1= numbers.stream()
        .peek(n -> someCustomOperation(n)).collect(Collectors.toList());                    // Collect results into a list

       System.out.println(numbers1); 

	}

}