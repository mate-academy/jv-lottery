package core.basesyntax;

public class Ball {
    private final String color;
    private final int number;

    public Ball(int number, String color) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Number of ball: " + number
                + ", color: " + color;
    }
}
