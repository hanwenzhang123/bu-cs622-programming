package map;

//This class is implemented from multiple interfaces
public class Position implements Left, Right, Up, Down {
    //final variable value can't be changed
    public static final int MAP_WIDTH = 500;
    public static final int MAP_HEIGHT = 500;
    private int xAxis;
    private int yAxis;
    private String character;

    //Constructor
    public Position(String character) {
        this.character = character;
        if (character == "Gorilla") {
            this.xAxis = 200;
            this.yAxis = 400;
        } else if  (character == "Mario") {
            this.xAxis = 50;
            this.yAxis = 50;
        } else if (character == "Princess") {
            this.xAxis = 250;
            this.yAxis = 450;
        } else {
            this.xAxis = 0;
            this.yAxis = 0;
        }
    }

    //Methods - using overloading
    //Get current location
    public String location() {
        return this.character + "is currently is at ( " + this.xAxis + ", " + this.yAxis + " )";
    }

    public void warning() {
        System.out.println("You are out of the map range.");
    }

    //move left
    public String goLeft() {
        if (this.xAxis > 0) {
            this.xAxis--;
        } else {
            warning();
        }
        return this.location();
    }
    //move left by a certain point
    public String goLeft(int left) {
        if (this.xAxis - left > 0) {
            this.xAxis = this.xAxis - left;
        } else {
            warning();
        }
        return this.location();
    }

    //move right
    public String goRight() {
        if (this.xAxis < this.MAP_WIDTH) {
            this.xAxis++;
        } else {
            warning();
        }
        return this.location();
    }
    //move right by a certain point
    public String goRight(int right) {
        if (this.xAxis + right < this.MAP_WIDTH) {
            this.xAxis = this.xAxis + right;
        } else {
            warning();
        }
        return this.location();
    }

    //move up
    public String goUp() {
        if (this.yAxis < this.MAP_HEIGHT) {
            this.yAxis++;
        } else {
            warning();
        }
        return this.location();
    }
    //move up by a certain point
    public String goUp(int up) {
        if (this.yAxis + up < this.MAP_HEIGHT) {
            this.yAxis = this.yAxis + up;
        } else {
            warning();
        }
        return this.location();
    }

    //move down
    public String goDown() {
        if (this.yAxis > 0) {
            this.yAxis--;
        } else {
            warning();
        }
        return this.location();
    }
    //move down by a certain point
    public String goDown(int down) {
        if (this.yAxis - down > 0) {
            this.yAxis = this.yAxis - down;
        } else {
            warning();
        }
        return this.location();
    }
}
