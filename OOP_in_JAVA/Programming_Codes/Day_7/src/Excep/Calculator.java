package Excep;

public class Calculator {
 public double caldouble(int number) throws MyArithException {
     if (number == 0) {
         throw new MyArithException("Zero not allowed");
     } else if (number < 0) {
         throw new MyArithException("Negative not allowed");
     }
     return number * 2.0; // Return double of the number
 }
}
