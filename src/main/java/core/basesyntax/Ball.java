package core.basesyntax;

public class Ball {
    private final Color color;

    private final int number;

    public Ball(Color color, int number) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball: " + color + " " + number;
    }
}
