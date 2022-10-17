package core.basesyntax;

public class Ball {
    private int number;
    private Color color;

    public Ball(int number, Color color) {
        this.number = number;
        this.color = color;
    }
    public String toString(int number, Color color) {
        return String.valueOf(number) + " " + color.name();
    }

    @Override
    public String toString() {
        return "Ball{" +
                "number=" + number +
                ", color=" + color +
                '}';
    }
}
