package core.basesyntax;

public class Ball {
    private final int number;
    private final Color color;

    public Ball(Color color, int number) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball "
                + "number: " + number
                + ", color: " + color;
    }
}

