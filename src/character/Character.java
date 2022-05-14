package character;

public abstract class Character {
    //abstract can not be private or final.
    public int healthPoints;

    public Character() {
        this.healthPoints = 100;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public abstract void die();
    public abstract void damaged();
    public abstract void damaged(int point);

//    public abstract void fight();
//    public abstract void hide();
}
