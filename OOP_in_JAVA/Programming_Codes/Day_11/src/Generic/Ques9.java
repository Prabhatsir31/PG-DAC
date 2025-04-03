/*
create a HashMap.
store  prn no. and students name of 10 students inside the HashMap.
now write this HashMap inside the file and read also. After reading display it using iterator.
*/
package Generic;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ques9 {
    public static void main(String[] args) {
        HashMap<String, String> studentMap = new HashMap<>();
        studentMap.put("101", "Domnik Torato");
        studentMap.put("102", "Brein Ocorner");
        studentMap.put("103", "Mia");
        studentMap.put("104", "Letty");
        studentMap.put("105", "Tej");
        studentMap.put("106", "John Cena");
        studentMap.put("107", "The Rock");
        studentMap.put("108", "Haan");
        studentMap.put("109", "Ivy");
        studentMap.put("110", "Heli");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
            oos.writeObject(studentMap);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.dat"))) {
            HashMap<String, String> deserializedMap = (HashMap<String, String>) ois.readObject();
            Iterator<Map.Entry<String, String>> iterator = deserializedMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                System.out.println("PRN: " + entry.getKey() + ", Name: " + entry.getValue());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
