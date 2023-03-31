package core.basesyntax;

public class Ball {
    private final String color;
    private final int number;

    public Ball(Color color, int number) {
        this.color = String.valueOf(color);
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball color: " + color + " and number: " + number;
    }
}
