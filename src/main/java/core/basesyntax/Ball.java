package core.basesyntax;

public class Ball {
    private int number;
    private Color color;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "number=" + number
                + ", color='" + color
                + '\'' + '}';
    }
}
