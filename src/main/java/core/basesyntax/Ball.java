package core.basesyntax;

public class Ball {
    private int number;
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    Ball(){}

    public Ball(int number, Color color) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color="
                + color + ", number="
                + number + '}';
    }
}
