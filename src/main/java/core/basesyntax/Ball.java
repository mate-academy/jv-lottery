package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public String toString() {
        return "The color of the ball is " + this.color + " and the number of the ball is "
                + this.number;
    }

    // setters
    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
