package Deve;

public class MyMath {
 public void disp(int num) throws NumberNotDivisibleBySevenException {
     if (num % 7 != 0) {
         throw new NumberNotDivisibleBySevenException("Number " + num + " is not divisible by 7.");
     } else {
         System.out.println("Number passed: " + num);
     }
 }
}