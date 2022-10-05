package core.basesyntax;

public class Ball {
    private DiffColor color;
    private int number;

    public Ball(DiffColor color, int number) {
        this.color = color;
        this.number = number;
    }

    public DiffColor getColor() {
        return color;
    }

    public void setColor(DiffColor color) {
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
        return "Color: " + color.name() + ", number: " + number;
    }
}
