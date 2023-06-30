package core.basesyntax;

public class Ball {
    private int number;
    private Colors color;

    public Ball(Colors color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "number="
                + number
                + ", color="
                + color + '}';
    }
}
