package core.basesyntax;

public class Ball {
    public enum Color {
        RED,
        GREEN,
        BLUE,
        YELLOW,
        ORANGE
    }

    private Color color;
    private int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return number + " " + color.name();
    }
}
