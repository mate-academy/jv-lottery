package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public Ball(Color color, int number) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color.name() + '\''
                + ", number=" + number
                + '}';
    }
}


