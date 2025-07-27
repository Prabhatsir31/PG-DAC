//create HashMap<Integer,String>
//    store 4 entries
//    key	value
//    1    	Java
//    2    	C++
//    3    	Python
//    4    	Database
//now accept a number from user between 1 to 4
//and retrive modulename for that number from the HashMap
//e.g. if user enters 3, Python should be retrieved from the HashMap

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {
	public static void main(String args[]) {
		HashMap<Integer, String> hashmaps = new HashMap<>();
		
		hashmaps.put(1, "Java");
		hashmaps.put(2, "C++");
		hashmaps.put(3, "Python");
		hashmaps.put(4, "Database");
		
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		
		int key = sc.nextInt();
		
		String moduleName = hashmaps.get(key);
		
		if(moduleName != null) {
			System.out.println("Module : " + moduleName);
		} else {
			System.out.println("Invalid number! Please enter the number between 1 to 4");
		}
		sc.close();
		
	}
}
