package core.basesyntax;

public class Ball {
    private final Color COLOR;
    private final int number;

    public Ball(Color COLOR, int number) {
        this.COLOR = COLOR;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color=" + COLOR +
                ", number=" + number +
                '}';
    }
}
