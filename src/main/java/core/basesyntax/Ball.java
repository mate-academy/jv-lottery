package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(Colors color, int number) {
        this.color = color.toString();
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
