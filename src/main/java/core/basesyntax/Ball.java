package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color.name();
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Color: " + getColor() + ", number: " + getNumber();
    }
}
