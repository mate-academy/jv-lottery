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

    public enum ColorList {
        RED,
        ORANGE,
        YELLOW,
        GREEN,
        BLUE,
        VIOLET
    }

    @Override
    public String toString() {
        return "The random ball is " + color + " at number " + number;
    }
}
