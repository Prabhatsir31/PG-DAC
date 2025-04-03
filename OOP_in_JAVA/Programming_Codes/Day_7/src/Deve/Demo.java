package Deve;

public class Demo {
 public static void main(String[] args) {
     MyMath myMath = new MyMath();
     try {
         myMath.disp(10); // This will throw an exception
         myMath.disp(14); // This will display the number
     } catch (NumberNotDivisibleBySevenException e) {
         System.out.println("Caught Exception: " + e.getMessage());
     }
 }
}