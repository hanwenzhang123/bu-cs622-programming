package game;

public class Weapon {
    public String name;
    public int damagePoint;

    public Weapon() {
        this.name = "Weapon";
        this.damagePoint = 30;
    }

    public Weapon(String name, int damagePoint) {
        this.name = name;
        this.damagePoint = damagePoint;
    }

    public int getDamagePoint() {
        return damagePoint;
    }

    public String getDamageInformation() {
        return this.name + " damages " + this.damagePoint + " health points.";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamagePoint(int damagePoint) {
        this.damagePoint = damagePoint;
    }
}
