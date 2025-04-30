package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String color,int number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return "Ball's color is " + this.color + ", ball's number is " + number;
    }
}
