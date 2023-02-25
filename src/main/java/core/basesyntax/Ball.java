package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public Ball(int number, Color color) {
        this.number = number;
        this.color = color;
    }

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

    @Override
    public String toString() {
        return "Ball with color " + color + " and number " + number;
    }
}
