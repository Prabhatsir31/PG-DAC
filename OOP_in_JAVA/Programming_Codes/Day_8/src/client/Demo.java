package client;

public class Demo {
    public static void main(String[] args) {
        // Specify the class name to create an instance of
   
        String className = "First"; // Change to "Second", "Third", or "Fourth" as needed

        try {
            Object obj = returnObject(className);
            System.out.println(obj);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static Object returnObject(String name) throws Exception {
        return Class.forName(name).getDeclaredConstructor().newInstance(); // Load and create an instance
    }
}