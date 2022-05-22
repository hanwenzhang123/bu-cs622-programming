package character;

public class Gorilla extends Character {
    public Gorilla() {
        super();
    }

    @Override
    public void die() {
        System.out.println("Gorilla died, Mario won, Princess is secured");
        this.healthPoints = 0;
    }

    @Override
    public void damaged() {
        if (this.healthPoints - 1 <= 0) {
            this.healthPoints = 0;
            System.out.println("Gorilla died, Mario won, Princess is secured");
        } else {
            this.healthPoints--;
            System.out.println("Gorilla got damaged, current health point is " + this.healthPoints);
        }
    }

    @Override
    public void damaged(int point) {
        if (this.healthPoints - point >= 1) {
            this.healthPoints = this.healthPoints - point;
            System.out.println("Gorilla got damaged, current health point is " + this.healthPoints);
        } else if (this.healthPoints - point <= 0) {
            this.healthPoints = 0;
            System.out.println("Gorilla died, Mario won, Princess is secured");
        }
    }

    //subclass of abstract class must implement (override) all the abstract methods unless the subclass is also an abstract class.
}
