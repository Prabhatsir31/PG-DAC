package core;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Sample 
{
	    public static void main(String[] args) 
	    {
	    	List<String> names = Arrays.asList("ABC", "CAB", "BCA"); 
	    	System.out.println(names);
			String result = names.stream().reduce("", (a, b) -> a + b.charAt(1)); 
			/*
			 * names list contain   [ABC, CAB, BCA]
			 * reduce  initially take "" in a  
			 * b will be the first element in the list i.e. ABC
			 * so first element's 1 index is B
			 * second time reduce will take  a   as  "B"
			 * b will be second element in the list i.e. CAB
			 * so CAB's 1 element is  "A
			 * now reduce 3rd time will take  a   as "BA"
			 * A will be concatenated to B
			 * b will be third element in the list i.e. BCA
			 * now reduce will concat 1st character of BCA 
			 * i.e. C to "BA"
			 * so final answer is "BAC"
			 */
			System.out.println(result);
			
			Integer total=Stream.of(1, 2, 3, 4, 5).reduce((a, b) -> a + b).get();
			/*
			 * first time a will be 1 b will be 2
			 * lambda logic is  a+b  i.e. 3
			 * next time reduce will take a as 3 and b as 3
			 * lambda logic will add 3+3  i.e. 6
			 * next time reduce will take a  as 6  and b  as 4
			 * lambda logic will add 6+4 i.e. 10
			 * next time reduce will take a as 10 and b as 5
			 * lambda will add  10+5
			 * so result is 15
			 */
			System.out.println(total);
			List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	        // Using reduce() with an identity value and a BinaryOperator
	        int product = numbers.stream()
	            .reduce(1, (a, b) -> a * b);
	        System.out.println("product is\t"+product);
	        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);

	        // Using reduce() to find the maximum value
	        int maxvalue= numbers1.stream()
	            .reduce((a, b) -> a > b ? a : b).get();
	        System.out.println(maxvalue);

	    }
}
