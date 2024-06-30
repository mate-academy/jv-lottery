package core.basesyntax.model;

public class Ball {
    private int number;
    private Color color;

    public Ball(int number, Color color) {
        this.number = number;
        this.color = color;
    }

    public enum Color {
        RED,
        ORANGE,
        YELLOW,
        GREEN,
        BLUE,
        PURPLE
    }

    @Override
    public String toString() {
        return "Ball{" +
                "number=" + number +
                ", color=" + color +
                '}';
    }
}
