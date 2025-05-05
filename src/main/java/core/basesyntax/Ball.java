package core.basesyntax;

public class Ball {
    private final int number;
    private final Color color;

    public Ball(final int number, final Color color) {
        this.number = number;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "number=" + number
                + ", color=" + color
                + '}';
    }
}
