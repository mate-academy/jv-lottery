package core.basesyntax;

public class Ball {
    private int number;
    private String color;

    public Ball(int number, Color color) {
        this.number = number;
        this.color = color.name();
    }

    @Override
    public String toString() {
        return "Ball{"
                + "number=" + number
                + ", color=" + color
                + '}';
    }
}
