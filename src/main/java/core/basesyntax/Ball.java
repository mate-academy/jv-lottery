package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return color.name() + " " + number;
    }
}
