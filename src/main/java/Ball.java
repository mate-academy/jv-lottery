import core.basesyntax.Color;
public class Ball {
    private int number;
    private Color color;
    public Ball(int number, Color color) {
        this.color = color;
        this.number = number;
    }
    @Override
    public String toString() {
        return "Ball{"
                + "number=" + number
                + ", color=" + color
                + '}';
    }
}
