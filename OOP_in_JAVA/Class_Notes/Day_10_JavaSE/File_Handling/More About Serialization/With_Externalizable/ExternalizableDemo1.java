/* Here we have complete control on serialization. We ensur that only "MyAccount" info will be serialized. */


import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable
{
	private int id;
	private String info;
	
	public Account()
	{
		System.out.println("in Account default constructor");
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the info
	 */
	public String getInfo() {
		return info;
	}
	/**
	 * @param info the info to set
	 */
	public void setInfo(String info) {
		this.info = info;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Account [id=" + id + ", info=" + info + "]";
	}
	
	
}
class BankDetails implements Serializable
{
	private int bankaccountno;
	private String type;
	public BankDetails()
	{
		System.out.println("in BankDetails default constructor");
	}
	/**
	 * @return the bankaccountno
	 */
	public int getBankaccountno() {
		return bankaccountno;
	}
	/**
	 * @param bankaccountno the bankaccountno to set
	 */
	public void setBankaccountno(int bankaccountno) {
		this.bankaccountno = bankaccountno;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BankDetails [bankaccountno=" + bankaccountno + ", type=" + type + "]";
	}
}
class MyAccount extends Account implements Externalizable { 
	
	private String username = "scott"; 
  
    private  String pwd = "tiger";
    
    private BankDetails details;
    
    /**
	 * @return the details
	 */
	public BankDetails getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(BankDetails details) {
		this.details = details;
	}

	public MyAccount()
    {
    	System.out.println("in MyAccount default constructor");
    }

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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyAccount [username=" + username + ", pwd=" + pwd + ", id="+getId()+", info="+getInfo()+" ,details=" + details + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("in writeExternal method");
		char arr[]=pwd.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char) ~arr[i];
		}
		String encriptpwd=new String(arr);
		out.writeUTF(encriptpwd);
		out.writeUTF(username);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("in readExternal method");
    	String str=in.readUTF();
    	char arr[]=str.toCharArray();
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=(char) ~arr[i];
    	}
    	pwd=new String(arr);
    	username=in.readUTF();
	}
} 
  
public class ExternalizableDemo1 { 
    public static void main(String[] args) throws Exception 
    { 
        MyAccount account = new MyAccount(); 
        account.setId(1);
        account.setInfo("Special");
        
        BankDetails bdetails=new BankDetails();
        bdetails.setBankaccountno(1000);
        bdetails.setType("Saving");
        account.setDetails(bdetails);
  
        System.out.println("Username : " + account.getUsername() +  
                                 "    Password : " + account.getPwd()); 
  
        FileOutputStream fos = new FileOutputStream("d:\\abc.txt"); 
  
        ObjectOutputStream oos = new ObjectOutputStream(fos); 
  
      
        oos.writeObject(account); 
        account=null;
  
        FileInputStream fis = new FileInputStream("d:\\abc.txt"); 
  
        ObjectInputStream ois = new ObjectInputStream(fis); 
  
      
        MyAccount ref = (MyAccount)ois.readObject(); 
  
        System.out.println(ref); 
        
    } 
} 
