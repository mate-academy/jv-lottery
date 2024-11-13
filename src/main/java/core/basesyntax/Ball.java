package core.basesyntax;

public class Ball {
    String color;
    int number;
    @Override
    public String toString() {
        return "Ball {color='" + color + "', number=" + number + "}";
    }
}
public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }
enum Color {
    RED,
    GREEN,
    BLUE,
    YELLOW,
    ORANGE
}