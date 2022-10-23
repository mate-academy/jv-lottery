package core.basesyntax;

public class Ball {

    private String color;
    private int number;

    //Constructor
    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    //Getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //Override
    @Override
    public String toString() {
        return super.toString();
    }

}
