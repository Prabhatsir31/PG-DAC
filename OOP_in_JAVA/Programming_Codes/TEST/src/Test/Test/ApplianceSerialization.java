import java.io.*;
import java.util.*;

// Define the interface
interface Electronic_Appliance extends Serializable {
    void on();

    void off();
}

// Implementing the TV class
class TV implements Electronic_Appliance {
    // private static final long serialVersionUID = 1L;
    private String brand;

    public TV(String brand) {
        this.brand = brand;
    }

    @Override
    public void on() {
        System.out.println(brand + " TV is now ON.");
    }

    @Override
    public void off() {
        System.out.println(brand + " TV is now OFF.");
    }

    public String toString() {
        return "TV [Brand: " + brand + "]";
    }
}

// Implementing the Refrigerator class
class Refrigerator implements Electronic_Appliance {
    // private static final long serialVersionUID = 1L;
    private String brand;

    public Refrigerator(String brand) {
        this.brand = brand;
    }

    @Override
    public void on() {
        System.out.println(brand + " Refrigerator is now ON.");
    }

    @Override
    public void off() {
        System.out.println(brand + " Refrigerator is now OFF.");
    }

    public String toString() {
        return "Refrigerator [Brand: " + brand + "]";
    }
}

// Main class for serialization and deserialization
public class ApplianceSerialization {
    public static void main(String[] args) {
        // Create an ArrayList of Electronic_Appliance
        List<Electronic_Appliance> appliances = new ArrayList<>();
        appliances.add(new TV("Samsung"));
        appliances.add(new Refrigerator("LG"));

        // File name for storage
        String fileName = "appliances.dat";

        // Serialize (save) the ArrayList to a file
        try (FileOutputStream fos = new FileOutputStream(fileName);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(appliances);
            System.out.println("Appliances list saved successfully.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize (read) the ArrayList from the file
        try (FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis)) {

            @SuppressWarnings("unchecked")
            List<Electronic_Appliance> readAppliances = (List<Electronic_Appliance>) ois.readObject();

            // Traverse the list using an Iterator and invoke on() and off() methods
            System.out.println("Appliances read from the file:");
            Iterator<Electronic_Appliance> itr = readAppliances.iterator();
            while (itr.hasNext()) {
                Electronic_Appliance appliance = itr.next();
                System.out.println(appliance); // Print appliance details
                appliance.on();
                appliance.off();
                System.out.println(); // Just for better readability
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
