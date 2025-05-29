import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample1 {
    public static void main(String[] args) 
{
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Create a stream and use peek to inspect elements
        List<Integer> result = numbers.stream()
            .peek(n -> System.out.println("Original: " + n))   // Peek at original elements
            .map(n -> n * 2)                                   // Transform elements
            .peek(n -> System.out.println("After map: " + n))  // Peek at transformed elements
            .filter(n -> n > 5)                               // Filter elements
            .peek(n -> System.out.println("After filter: " + n)) // Peek at filtered elements
            .collect(Collectors.toList());                    // Collect results into a list

        System.out.println("Final result: " + result); 
}
}