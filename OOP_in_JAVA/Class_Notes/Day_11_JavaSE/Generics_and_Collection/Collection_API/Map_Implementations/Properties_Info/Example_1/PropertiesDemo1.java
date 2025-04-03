import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo1
{
	public static void main(String args[])
	{
		FileReader reader=null;
		try {
			reader = new FileReader("e:\\my.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
        // create properties object
        Properties p = new Properties();
  
        // Add a wrapper around reader object
        try {
			p.load(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  
        // access properties data
        System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("password"));
	}
}