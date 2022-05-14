package map;

public class Movement implements Left, Right, Up, Down {
    //Implement multiple interfaces
    private int xAxis;
    private int yAxis;

    //Getter
    public int getxAxis() {
        return xAxis;
    }
    public int getyAxis() {
        return yAxis;
    }

    //Setter
    public void setxAxis(int xAxis) {
        this.xAxis = xAxis;
    }
    public void setyAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    //Methods - using overloading
    //Get current location
    public String location() {
        return "Currently is at ( " + this.xAxis + ", " + this.yAxis + " )";
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
        if (this.xAxis < 500) {
            this.xAxis++;
        }
        return this.location();
    }
    //move right by a certain point
    public String goRight(int right) {
        if (this.xAxis + right < 500) {
            this.xAxis = this.xAxis + right;
        }
        return this.location();
    }

    //move up
    public String goUp() {
        if (this.yAxis < 500) {
            this.yAxis++;
        }
        return this.location();
    }
    //move up by a certain point
    public String goUp(int up) {
        if (this.yAxis + up < 500) {
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
