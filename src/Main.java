import character.Gorilla;
import character.Mario;
import character.Princess;
import map.Position;
import game.Cask;
import game.Weapon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Donkey Pong Game Starts!!! \n");

        // Instantiate Objects
        Mario mario = new Mario();  //extends from an abstract parent class
        Gorilla gorilla = new Gorilla(); //extends from an abstract parent class
        Princess princess = new Princess(); //extends from an abstract parent class

        Position marioPosition = new Position("Mario"); //implemented multiple interfaces
        Position gorillaPosition = new Position("Gorilla");  //implemented multiple interfaces
        Position princessPosition = new Position("Princess");  //implemented multiple interfaces

        System.out.println(marioPosition.location());
        System.out.println(gorillaPosition.location());
        System.out.println(princessPosition.location());

        Cask bigCask = new Cask("Big");  //Cask as a child class is extending Weapon as its parent class
        Cask mediumCask = new Cask("Medium");  //Cask as a child class is extending Weapon as its parent class
        Cask smallCask = new Cask("Small");  //Cask as a child class is extending Weapon as its parent class
        Cask specialCask = new Cask("Other", "SpecialCask", 25); //Special Cask Customized name and damage point through Weapon class
        Weapon bullet = new Weapon("Bullet", 35);  //Weapon class as a parent class but not abstract class, so we can instantiate the object

        //Cask as the child class override the method to print differently
        System.out.println("\nWeapon Information:");
        System.out.println(specialCask.getDamageInformation());
        System.out.println(bullet.getDamageInformation());

        int bigCaskDamagePoint = bigCask.getDamagePoint();
        int mediumCaskDamagePoint = mediumCask.getDamagePoint();
        int smallCaskDamagePoint = smallCask.getDamagePoint();
        int specialCaskDamagePoint = specialCask.getDamagePoint();
        int bulletDamagePoint = bullet.getDamagePoint();

        System.out.println("\n********Fighting Starts********\n");

        // using overloading here
        // when the health point is less or equal to 0, the character dies
        marioPosition.goRight(300);
        marioPosition.goUp(220);
        gorillaPosition.goDown(100);
        gorillaPosition.goDown();
        gorillaPosition.goLeft(20);
        marioPosition.goLeft();
        System.out.println(marioPosition.location());
        System.out.println(gorillaPosition.location());
        System.out.println(princessPosition.location());

        mario.damaged();
        mario.damaged(mediumCaskDamagePoint);
        gorilla.damaged(smallCaskDamagePoint);
        gorilla.damaged(bulletDamagePoint);
        gorilla.damaged();
        mario.damaged();
        mario.damaged(specialCaskDamagePoint);
        gorilla.damaged(bigCaskDamagePoint);
        gorilla.damaged();
        gorilla.damaged(bulletDamagePoint);

        System.out.println("\n********Game Over********\n");

        int marioHealthPoints = mario.getHealthPoints();
        int gorillaHealthPoints = gorilla.getHealthPoints();

        if (gorillaHealthPoints <= 0) {
            princess.setSecured(true);
            gorilla.die();
        } else if (marioHealthPoints <= 0) {
            princess.setSecured(false);
            mario.die();
        }

        boolean princessSecured = princess.getSecured();
        System.out.println("Princess is secured? " + princessSecured);
    }
}
