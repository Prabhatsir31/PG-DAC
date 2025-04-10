/*
Create an interface Product with a method displayDetails().
Create two classes:
Electronics and Groceries 
Both should implement Product.
Store objects of both the classes in a ArrayList<Product>.
store ArrayList in the file , then read ArrayList from the file and display.
*/
package Generic;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

interface Product {
    void displayDetails();
}

class Electronics implements Product, Serializable {
    private String name;
    private double price;

    public Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronics [Name: " + name + ", Price: " + price + "]");
    }
}

class Groceries implements Product, Serializable {
    private String name;
    private double price;

    public Groceries(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void displayDetails() {
        System.out.println("Groceries [Name: " + name + ", Price: " + price + "]");
    }
}

public class Ques7 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Electronics("Laptop", 1200.00));
        productList.add(new Electronics("Smartphone", 800.00));
        productList.add(new Groceries("Milk", 1.50));
        productList.add(new Groceries("Bread", 2.00));

        try {
            FileOutputStream fos = new FileOutputStream("products.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
            oos.close();

            FileInputStream fis = new FileInputStream("products.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Product> deserializedList = (List<Product>) ois.readObject();
            ois.close();

            System.out.println("Products read from the file:");
            for (Product product : deserializedList) {
                product.displayDetails();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}