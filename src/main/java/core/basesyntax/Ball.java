package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball() {

    }

    public Ball(int number, String color) {
        this.color = color;
        this.number = number;
    }

    public String toString() {
        return color + " BALL WITH NUMBER " + number;
    }
}
