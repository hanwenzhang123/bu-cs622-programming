package map;

//This class is implemented from multiple interfaces
public class Position implements Left, Right, Up, Down {
    //final variable value can't be changed
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
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

    //move left
    public String goLeft() {
        if (this.xAxis > 0) {
            this.xAxis--;
        }
        return this.location();
    }
    //move left by a certain point
    public String goLeft(int left) {
        if (this.xAxis - left > 0) {
            this.xAxis = this.xAxis - left;
        }
        return this.location();
    }

    //move right
    public String goRight() {
        if (this.xAxis < this.WIDTH) {
            this.xAxis++;
        }
        return this.location();
    }
    //move right by a certain point
    public String goRight(int right) {
        if (this.xAxis + right < this.WIDTH) {
            this.xAxis = this.xAxis + right;
        }
        return this.location();
    }

    //move up
    public String goUp() {
        if (this.yAxis < this.HEIGHT) {
            this.yAxis++;
        }
        return this.location();
    }
    //move up by a certain point
    public String goUp(int up) {
        if (this.yAxis + up < this.HEIGHT) {
            this.yAxis = this.yAxis + up;
        }
        return this.location();
    }

    //move down
    public String goDown() {
        if (this.yAxis > 0) {
            this.yAxis--;
        }
        return this.location();
    }
    //move down by a certain point
    public String goDown(int down) {
        if (this.yAxis - down > 0) {
            this.yAxis = this.yAxis - down;
        }
        return this.location();
    }
}
