/*
accept 10 characters from a user ( use Scanner).
store these 10 characters in a file. (FileWriter)
Now open a file and read all these characters.
*/
package File;
import java.awt.im.InputContext;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Ques1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the 10 Character are : \n");
		StringBuilder inputCharacter = new StringBuilder();
		
		for(int i = 0; i < 10; i++) {
			char ch = scanner.next().charAt(0);
			inputCharacter.append(ch);
		}
		
		try (FileWriter writer = new FileWriter("character.txt")) {
			writer.write(inputCharacter.toString());
			System.out.println("Character has been written to character.txt file");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (FileReader reader = new FileReader("character.txt")) {
			int ch;
			System.out.println("Reading characters from the file: ");
			while((ch = reader.read()) != -1) {
				System.out.println((char) ch);
			}
			System.out.println();
		} catch(IOException e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
