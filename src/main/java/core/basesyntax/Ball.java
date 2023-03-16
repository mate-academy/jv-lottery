package core.basesyntax;

public class Ball {
    private final Color color;
    private final int number;

    public Ball(final Color color, final int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Color:" + color + ", number:" + number;
    }
}
