package core.basesyntax;

public class Ball {
    String color;
    int number;
    @Override
    public String toString() {
        return "Ball {color='" + color + "', number=" + number + "}";
    }
}
enum Color {
    RED,
    GREEN,
    BLUE,
    YELLOW,
    ORANGE
}