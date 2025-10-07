package core.basesyntax;

public class Ball {
    private final int number;
    private final BallColor color;

    public Ball(int number, BallColor color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" + "number=" + number + ", color=" + color.name() + "}";
    }
}
