package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball() {

    }

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    public String toString(Colors color) {
        return "Color of the ball - " + color;
    }

    public String toString(int number) {
        return "Ball number - " + number;
    }

}
