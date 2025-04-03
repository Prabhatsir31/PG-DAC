/*
create a parent class "Artist" with a member function "void perform()".
now derive following child classes from "Artist"
	Actor,Singer and Musician and override "perform" in these classes to write the specific task.
inside "Actor" class define one more method
	void changeGateUp()
	{
		S.o.p("as per the role demands");
	}

now create a Demo class with main function.
inside main function create array of "Artist" with size 3.
store instances of the above child classes in it.
Now traverse through the array and invoke "perform" of each child class. In addition to this 
wherever "Actor" object is there inside the array , also perform "changeGateUp()" method.

*/
package Revision;

class Artist {
    public void perform() {
        System.out.println("Artist is performing.");
    }
}

class Actor extends Artist {
    @Override
    public void perform() {
        System.out.println("Actor is acting.");
    }

    public void changeGateUp() {
        System.out.println("As per the role demands.");
    }
}

class Singer extends Artist {
    @Override
    public void perform() {
        System.out.println("Singer is singing.");
    }
}

class Musician extends Artist {
    @Override
    public void perform() {
        System.out.println("Musician is playing an instrument.");
    }
}

public class Ques4 {
    public static void main(String[] args) {
        Artist[] artists = new Artist[3]; // Create an array of Artist with size 3

        // Store instances of the child classes in the array
        artists[0] = new Actor();
        artists[1] = new Singer();
        artists[2] = new Musician();

        // Traverse through the array and invoke perform() of each child class
        for (Artist artist : artists) {
            artist.perform(); // Call the perform method

            // If the artist is an instance of Actor, call changeGateUp()
            if (artist instanceof Actor) {
                ((Actor) artist).changeGateUp(); // Cast to Actor and call changeGateUp()
            }
        }
    }
}