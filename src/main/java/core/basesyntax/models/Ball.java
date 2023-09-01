package core.basesyntax.models;

public class Ball {
    private int number;
    private Color color;

    public Ball(int number, Color color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{ number=" + number
                + ", color=" + color + '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
