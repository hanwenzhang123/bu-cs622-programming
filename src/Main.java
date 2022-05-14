import character.Gorilla;
import character.Mario;
import character.Princess;

public class Main {
    public static void main(String[] args) {
        System.out.println("Donkey Pong Game Starts!!!");

        // instantiate objects (both objects extends from an abstract parent class)
        Mario mario = new Mario();
        Gorilla gorilla = new Gorilla();
        Princess princess = new Princess();

        // using overloading here
        // when the health point is less or equal to 0, the character dies
        mario.damaged();
        mario.damaged(20);
        mario.damaged(20);
        gorilla.damaged(99);
        mario.die();
        gorilla.damaged();

        int marioHealthPoints = mario.getHealthPoints();
        int gorillaHealthPoints = mario.getHealthPoints();

        if (gorillaHealthPoints < 0) {
            princess.setSecured(true);
        } else if (marioHealthPoints < 0) {
            princess.setSecured(false);
        }

        boolean princessSecured = princess.getSecured();
        System.out.println("Princess is secured? " + princessSecured);
    }
}
