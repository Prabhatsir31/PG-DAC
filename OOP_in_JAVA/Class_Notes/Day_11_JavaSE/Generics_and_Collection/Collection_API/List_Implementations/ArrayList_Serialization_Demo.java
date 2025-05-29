/*class Student implements Serializable
	rollno
	name

create 2 objects of Student , store them inside ArrayList and store that ArrayList inside the file.

now read from file , the ArrayList and traverse it using Iterator
*/


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student implements Serializable
{
		private int rollno;
		private String name;
		/**
		 * @return the rollno
		 */
		public int getRollno() {
			return rollno;
		}
		/**
		 * @param rollno the rollno to set
		 */
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", name=" + name + "]";
		}
		
}
public class ArrayList_Serialization_Demo
{
	public static void main(String args[])
	{
		List<Student>mylist=new ArrayList<Student>();
		Student s1=new Student();
		Student s2=new Student();
		s1.setRollno(1);
		s1.setName("Abc");
		s2.setRollno(2);
		s2.setName("Xyz");
		mylist.add(s1);
		mylist.add(s2);
		FileOutputStream fos=null;
		FileInputStream fis=null;
		ObjectOutputStream oos=null;
		ObjectInputStream ois=null;
		
		try {
			fos=new FileOutputStream("c:\\temp\\temp.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			oos=new ObjectOutputStream(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			oos.writeObject(mylist);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // serialization
		
		// now reading list from file
		
		try {
			fis=new FileInputStream("c:\\temp\\temp.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ois=new ObjectInputStream(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Student> ref=null;
		try {
			ref=(List<Student>) ois.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Iterator itr=ref.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}