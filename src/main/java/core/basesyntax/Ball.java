package core.basesyntax;

public class Ball {
    private String color;
    private int number;




    //geter seter col
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    //get set num
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    // Override the toString() method
    @Override
    public String toString() {
        return "Ball[color=" + color + ", number=" + number + "]";
    }
}
