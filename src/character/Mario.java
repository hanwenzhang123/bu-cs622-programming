package character;

public class Mario extends Character {
    public Mario() {
        super();
    }

    @Override
    public void die() {
        System.out.println("Mario died, Gorilla won, Princess is not secured");
        this.healthPoints = 0;
    }

    @Override
    public void damaged() {
        if (this.healthPoints - 1 <= 0) {
            this.healthPoints = 0;
            System.out.println("Mario died, Gorilla won, Princess is not secured");
        } else {
            this.healthPoints--;
            System.out.println("Mario got damaged, current health point is " + this.healthPoints);
        }
    }

    @Override
    public void damaged(int point) {
        if (this.healthPoints - point >= 1) {
            this.healthPoints = this.healthPoints - point;
            System.out.println("Mario got damaged, current health point is " + this.healthPoints);
        } else if (this.healthPoints - point <= 0) {
            this.healthPoints = 0;
            System.out.println("Mario died, Gorilla won, Princess is not secured");
        }
    }

    //subclass of abstract class must implement (override) all the abstract methods unless the subclass is also an abstract class.
}
