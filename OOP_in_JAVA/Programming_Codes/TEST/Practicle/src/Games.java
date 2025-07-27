//create interface "Game" , have an abstract method "play()". from this interface implements 
//classes like "Cricket" , "FootBall" and "Tennis".
//Now Define one more class
//public class Demo with main function.
//In this class have a static method "perform" which will take interface reference as parameter.
//inside "perform()" see to it that if Cricket is passed ,its "play()" method should be invoked only. 
//Call "perform()" method from main function.



interface Game {
    void play();
}

class Cricket implements Game {
    public void play() {
        System.out.println("Playing Cricket");
    }
}

class Football implements Game {
    public void play() {
        System.out.println("Playing Football");
    }
}

class Tennis implements Game {
    public void play() {
        System.out.println("Playing Tennis");
    }
}

public class Games {
    public static void perform(Game game) {
        if (game instanceof Cricket) {
            game.play();
        }
    }

    public static void main(String[] args) {
        Game cricket = new Cricket();
        Game football = new Football();
        Game tennis = new Tennis();

        perform(cricket); // This will invoke play() for Cricket
        // perform(football); // Uncomment to test Football
        // perform(tennis); // Uncomment to test Tennis
    }
}
