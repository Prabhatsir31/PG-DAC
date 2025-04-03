import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class MyAccount implements Serializable { 
  
    private String username = "scott"; 
  
    private transient String pwd = "tiger";

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	} 
	// customized serialization for the purpose of password encription
	private void writeObject(ObjectOutputStream o) throws IOException
	{
		System.out.println("in writeObject method");
		char arr[]=pwd.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char) ~arr[i];
		}
		String encriptpwd=new String(arr);
		o.writeUTF(encriptpwd);
		o.defaultWriteObject();
	}
	// customized deserialization for the purpose of decryption
    private void readObject(ObjectInputStream o) throws ClassNotFoundException, IOException
    {
    	System.out.println("in readObject method");
    	String str=o.readUTF();
    	char arr[]=str.toCharArray();
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=(char) ~arr[i];
    	}
    	pwd=new String(arr);
    	o.defaultReadObject();
    }
} 
  
public class CustomizedSerializationDemo4 { 
    public static void main(String[] args) throws Exception 
    { 
        MyAccount account = new MyAccount(); 
  
        System.out.println("Username : " + account.getUsername() +  
                                 "    Password : " + account.getPwd()); 
  
        FileOutputStream fos = new FileOutputStream("d:\\abc.txt"); 
  
        ObjectOutputStream oos = new ObjectOutputStream(fos); 
  
      
        oos.writeObject(account); 
  
        FileInputStream fis = new FileInputStream("d:\\abc.txt"); 
  
        ObjectInputStream ois = new ObjectInputStream(fis); 
  
      
        MyAccount ref = (MyAccount)ois.readObject(); 
  
        System.out.println("Username : " + ref.getUsername() +  
                               "      Password : " + ref.getPwd()); 
    } 
} 
