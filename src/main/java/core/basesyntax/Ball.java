package core.basesyntax;

public class Ball {
    private Color.GetColor color;
    private int number;

    public Ball(Color.GetColor color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }
}
