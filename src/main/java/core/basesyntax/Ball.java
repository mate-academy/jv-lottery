package core.basesyntax;

public class Ball {
    Color color;
    int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    public Ball(String color, int number) {
        this.color = Color.valueOf(color);
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
