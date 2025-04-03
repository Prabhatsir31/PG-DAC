/*
using RandomAccessFile class create a file.
accept a message from user and write in a file.
now read the message which u have stored in a file.
now again accept a message and write in a file at the end of existing message.
now read the entire content of file . ( u should be able to read both the messages now)
*/
package File;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RandomAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        try (RandomAccessFile raf = new RandomAccessFile("messages.txt", "rw")) {
            System.out.print("Enter the first message: ");
            String firstMessage = scanner.nextLine();
            raf.writeBytes(firstMessage + "\n"); 
            
            raf.seek(0); 
            System.out.println("Reading the first message from the file:");
            String line;
            while ((line = raf.readLine()) != null) {
                System.out.println(line);
            }
            
            System.out.print("Enter the second message to append: ");
            String secondMessage = scanner.nextLine();
            raf.seek(raf.length()); 
            raf.writeBytes(secondMessage + "\n"); 
            
            raf.seek(0);
            System.out.println("Reading all messages from the file:");
            while ((line = raf.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close(); 
        }
    }
}
