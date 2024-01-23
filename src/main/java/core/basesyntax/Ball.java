package core.basesyntax;
public class Ball {
    String color;
    int number;
    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
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
