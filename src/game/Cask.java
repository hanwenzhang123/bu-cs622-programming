package game;

public class Cask extends Weapon {  //Cask as a subclass extends its parent class Weapon
    private String size;
    public Cask(String size) {
        super();
        this.size = size;
        switch (size) {
            case "Big":
                super.setDamagePoint(30);
                break;
            case "Medium" :
                super.setDamagePoint(20);
                break;
            case "Small" :
                super.setDamagePoint(10);
                break;
            default:
                super.setDamagePoint(5);
                break;
        }
    }

    public Cask(String size, String name, int damagePoint) {
        super(name, damagePoint);
        this.size = size;
    }

    @Override
    public String getDamageInformation() {
        return "The size of this cask is " + this.size + ". Each hit damages " + this.damagePoint + " health points.";
    }
}
