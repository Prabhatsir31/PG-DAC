/*
create a class MyNum with
		private int num;
		parameterized constructor
		
Demo class with main
	create 4 objects of MyNum by passing different integers.
	store these 4 objects inside "ArrayList"
	and now store that ArrayList inside file system.
	
	read ArrayList from file and traverse it using Iterator.

*/
package Generic;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

class MyNum implements Serializable {
	private int num;
	public MyNum(int num) {
		this.num = num;
	}
	
	public String toString() {
		return "MyNum [num=" + num + "]";
	}
}

public class Ques5 {
	public static void main(String[] args) {
        List<MyNum> myNumList = new ArrayList<>();
        myNumList.add(new MyNum(10));
        myNumList.add(new MyNum(20));
        myNumList.add(new MyNum(30));
        myNumList.add(new MyNum(40));

        try {
            FileOutputStream fos = new FileOutputStream("mynumlist.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(myNumList);
            oos.close();
            FileInputStream fis = new FileInputStream("mynumlist.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<MyNum> deserializedList = (List<MyNum>) ois.readObject();
            ois.close();
            System.out.println("MyNum objects read from the file:");
            Iterator<MyNum> iterator = deserializedList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
