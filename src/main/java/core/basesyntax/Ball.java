package core.basesyntax;

public class Ball {
    private final int number;
    private final String color;

    public Ball(int number, String color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Ball{number = %d, color = %s}", number, color);
    }
}
