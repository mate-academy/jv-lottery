package core.basesyntax;

public class Ball {
    private final int number;
    private final DifferentColor color;

    public Ball(DifferentColor color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{" + "color='" + color + '\'' + ", number=" + number + '}';
    }
}
