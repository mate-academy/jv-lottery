package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Color:" + color + ", number:" + number;
    }
}

    enum Color {
    WHITE, GREEN, GOLD, SILVER, ORANGE, PURPLE;
    }