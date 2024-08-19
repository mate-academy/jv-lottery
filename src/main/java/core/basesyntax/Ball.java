package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(Color color, int number) {
        this.number = number;
        this.color = String.valueOf(color);
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color=" + color
                + ", number=" + number
                + '}';
    }
}
