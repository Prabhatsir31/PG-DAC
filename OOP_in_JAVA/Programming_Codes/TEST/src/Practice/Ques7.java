/*
create HashMap<Integer,String>
store 4 entries
	key	value

	1    	Java
	2    	C++
	3    	Python
	4    	Database

now accept a number from user between 1 to 4
and retrive modulename for that number from the HashMap
e.g. if user enters 3, Python should be retrieved from the HashMap
*/
package Practice;

import java.util.HashMap;
import java.util.Scanner;

public class Ques7 {
	public static void main(String args[]) {
		HashMap<Integer, String> moduleMap = new HashMap<>();
		
		moduleMap.put(1, "Java");
		moduleMap.put(2, "C++");
		moduleMap.put(3, "Python");
		moduleMap.put(4, "Database");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number between 1 to 4 : ");
		int userInput = scanner.nextInt();
		
		if (moduleMap.containsKey(userInput)) {
			String moduleName = moduleMap.get(userInput);
			System.out.println("Module name for "+ userInput + ": " + moduleName );
		} else {
			System.out.println("Invalid input! Please enter a number between 1 and 4.");
		}
		scanner.close();
	}
}
