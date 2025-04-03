package threadrpo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo2
{
	public static void main(String args[])
	{
		  Properties p = new Properties();
		  
	        // add properties to it
	        p.setProperty("name", "Sachin");
	        p.setProperty("email",
	                      "Sachin@gmail.com");
	  
	        // store the properties to a file
	        try {
				p.store(new FileWriter("e:\\info.properties"),
				        "Basic properties example");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}