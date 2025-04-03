// 9) create interface "Game" , have an abstract method "play()". from this interface implements classes like "Cricket" , "FootBall" and "Tennis".
// Now Define one more class 
// public class Demo with main function.
// In this class have a static method "perform" which will take interface reference as parameter.
// inside "perform()" see to it that any child object passed ,its "play()" method should be invoked.
// Call "perform()" method from main function.

package InheritanceAssignment;

//Interface Game
interface Game {
 void play(); // Abstract method
}

//Class Cricket implementing Game
class Cricket implements Game {
 @Override
 public void play() {
     System.out.println("Playing Cricket");
 }
}

//Class Football implementing Game
class Football implements Game {
 @Override
 public void play() {
     System.out.println("Playing Football");
 }
}

//Class Tennis implementing Game
class Tennis implements Game {
 @Override
 public void play() {
     System.out.println("Playing Tennis");
 }
}

//Class Demo with main function
public class Ques9 {
 // Static method perform that takes Game interface reference
 public static void perform(Game game) {
     game.play(); // Invoke the play() method of the passed object
 }

 public static void main(String[] args) {
     // Create instances of the game classes
     Game cricket = new Cricket();
     Game football = new Football();
     Game tennis = new Tennis();

     // Call the perform method with different game objects
     perform(cricket); // Output: Playing Cricket
     perform(football); // Output: Playing Football
     perform(tennis); // Output: Playing Tennis
 }
}
