package core.basesyntax;

public class Ball {
    private colors color;
    private int number;

    public void setColor(colors color) {
        this.color = color;
    }

    public colors getColor() {
        return color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball " + number + " with " + color + " color".toString();
    }
}
