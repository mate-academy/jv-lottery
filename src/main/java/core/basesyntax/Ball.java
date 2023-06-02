package core.basesyntax;

public class Ball {
    enum Color {
            RED, GREEN, BLUE, YELLOW, ORANGE
    }

    private Color color;
    private int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    public String toString() {
        return "Ball{"
                    + "color="
                    + color
                    + ", number="
                    + number + '}';
    }
}

