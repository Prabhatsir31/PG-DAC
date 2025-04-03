import java.io.*;
public class one
{
		public static void main(String args[])
		{
			
			saveme s=new saveme();
			s.setNum(100);
			s.setVar(200);
			Part ref=s.getPart();
			ref.setVal(300);
			System.out.println(s.getNum());
			System.out.println(s.getVar());
			System.out.println(ref.getVal());
			try(FileOutputStream fos=new FileOutputStream("d:\\ab2.txt"))
			{
			try(ObjectOutputStream oos=new ObjectOutputStream(fos))
			{
			oos.writeObject(s); //Serialization
			}
			}
			catch(Exception ee)
			{
				ee.printStackTrace();
			}
System.out.println(s.num);
			s=null;

			try(FileInputStream fis=new FileInputStream("d:\\ab2.txt"))
			{
			try(ObjectInputStream ois=new ObjectInputStream(fis))
			{
			System.out.println("While deserializing");
			saveme s1=(saveme)ois.readObject();
// Deserialization
			Part ref1=s1.getPart();
			System.out.println(s1.getNum());
			System.out.println(s1.getVar());
			System.out.println(ref1.getVal());
			}
			}
			catch(Exception ee)
			{
				ee.printStackTrace();
			}
		}
}