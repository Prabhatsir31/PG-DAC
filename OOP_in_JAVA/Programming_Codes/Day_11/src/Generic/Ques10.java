/*
create a hierarchy as follows
	interface Game- play() method
	Derive at least 3 classes from it. ( Cricket, Chess and Football )
Now Create generic class which can take Game type (i.e. any sub type of Game) as parameter.
In this class try to call the play() method of the class which is passed to it.
*/
package Generic;

interface Game {
    void play();
}

class Cricket implements Game {
    @Override
    public void play() {
        System.out.println("Playing Cricket");
    }
}

class Chess implements Game {
    @Override
    public void play() {
        System.out.println("Playing Chess");
    }
}

class Football implements Game {
    @Override
    public void play() {
        System.out.println("Playing Football");
    }
}

class GamePlayer<T extends Game> {
    private T game;

    public GamePlayer(T game) {
        this.game = game;
    }

    public void startGame() {
        game.play();
    }
}

public class Ques10 {
    public static void main(String[] args) {
        GamePlayer<Cricket> cricketPlayer = new GamePlayer<>(new Cricket());
        cricketPlayer.startGame();

        GamePlayer<Chess> chessPlayer = new GamePlayer<>(new Chess());
        chessPlayer.startGame();

        GamePlayer<Football> footballPlayer = new GamePlayer<>(new Football());
        footballPlayer.startGame();
    }
}

