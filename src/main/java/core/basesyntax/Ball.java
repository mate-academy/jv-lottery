package core.basesyntax;

public class Ball {

    private String color;
    private int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    public enum Color {
        RED,
        BLUE,
        YELLOW,
        PINK,
        VIOLET,
        ORANGE,
        GREEN
    }

    @Override
    public String toString() {
        return "Ball{color=" + color + ", number=" + number + "}";
    }
}
