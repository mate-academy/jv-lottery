package core.basesyntax;

public class Ball {
    private int number;
    private String color;

    public Ball(int number, Colors color) {
        this.number = number;
        this.color = String.valueOf(color);
    }

    @Override
    public String toString() {
        return "Ball{"
                + "number=" + number
                + ", color='" + color + '\''
                + '}';
    }
}
