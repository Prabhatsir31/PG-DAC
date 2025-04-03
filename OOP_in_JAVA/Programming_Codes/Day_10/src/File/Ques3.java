/*
write a file copy program using FileInputStream and FileOutputStream

	hint: existing file u need to open using FileInputStream and new file u need
 to open using FileOutputStream.

	first read existing file's data inside byte array and then write the same
 byte array inside new file.

	byte array should be created equivalent to the length of existing file.
*/
package File;
import java.io.*;

public class Ques3 {
	public static void main(String args[]) {
		String sourcefile = "E:\\\\SM_VITA-DAC\\\\MAIN_COURSE\\\\OOP_in_JAVA\\\\Class_Notes\\\\Day_10_JavaSE\\\\File_Handling/Stream Info.txt";
		String destinationfile = "Copy.txt";
		
		try {
			FileInputStream fis = new FileInputStream(sourcefile);
			byte[] buffer = new byte[fis.available()];
			fis.read(buffer);
			
			FileOutputStream fos = new FileOutputStream(destinationfile);
			fos.write(buffer);
			fos.close();
			System.out.println("File Copied Successfully");
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error : " + e.getMessage());
		}
	}
}
