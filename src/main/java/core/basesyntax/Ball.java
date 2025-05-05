package core.basesyntax;

public class Ball {
    private final String color;
    private final int number;

    public Ball(String color, int number) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return color + " " + number;
    }
}
