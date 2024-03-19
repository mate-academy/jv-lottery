package core.basesyntax;

public class Ball {
    private final Color COLOR;
    private final int NUMBER;

    public Ball(Color color, int number) {
        this.COLOR = color;
        this.NUMBER = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + COLOR + '\''
                + ", number=" + NUMBER
                + '}';
    }
}
