package core.basesyntax;

public class Ball {
    private Color color;
    private final int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Ball color: " + color.name() + ", number: " + number;
    }
}
