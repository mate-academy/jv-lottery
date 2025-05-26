package core.basesyntax;

public class Ball {

    private Color color;
    private int number;

    public Ball(Color colors, int number) {
        this.color = colors;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                +
                "colors=" + color
                +
                ", number=" + number
                +
                '}';
    }
}
