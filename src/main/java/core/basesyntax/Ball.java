package core.basesyntax;

public class Ball {
    enum Color {
        RED, GREEN, BLUE, YELLOW, ORANGE
    }

    public Color color;
    public int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    public String toString() {
        return "Ball{" +
                "color=" + color +
                ", number=" + number +
                '}';
    }
}
