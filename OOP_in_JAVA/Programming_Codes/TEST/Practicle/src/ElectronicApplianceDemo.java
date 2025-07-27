//create interface Electronic_Appliance with on and off  methods
//define two implementations Tv and Refrigerator
//create ArrayList for Electronic_Appliance  i.e.  new ArrayList<Electronic_Appliance>
//store Tv and Refrigerator inside ArrayList. Store ArrayList inside the file
//read the list from the file and traverse it using Iterator. Also while iterating invoke on and off  methods

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

interface Electronic_Appliance extends Serializable {
	void on();
	void off();
}

class Tv implements Electronic_Appliance {
	public void on() {
		System.out.println("Tv ON");
	}
	
	public void off() {
		System.out.println("Tv OFF");
	}
}

class Refrigerator implements Electronic_Appliance {
	public void on() {
		System.out.println("Refrigerator On");
	}
	
	public void off() {
		System.out.println("Refrigerator OFF");
	}
}

public class ElectronicApplianceDemo {
	public static void main(String args[]) {
		ArrayList<Electronic_Appliance> appliance = new ArrayList<>();
		appliance.add(new Tv());
		appliance.add(new Refrigerator());
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("appliance.dat"))) {
			oos.writeObject(appliance);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("appliance.dat"))) {
			ArrayList<Electronic_Appliance> readappliance = (ArrayList<Electronic_Appliance>) ois.readObject();
			Iterator<Electronic_Appliance> iterator = readappliance.iterator();
			while(iterator.hasNext()) {
				Electronic_Appliance electronic = iterator.next();
				electronic.on();
				electronic.off();
			}
		} catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
