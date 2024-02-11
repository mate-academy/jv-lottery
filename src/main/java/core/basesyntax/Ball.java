package core.basesyntax;

public class Ball {
    private BallColor color;
    private int number;

    public Ball(BallColor color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color=" + color
                + ", number=" + number
                + '}';
    }
}
