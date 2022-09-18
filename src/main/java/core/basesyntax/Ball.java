package core.basesyntax;

public class Ball {
    private Colors color;
    private int number;

    public void setColor(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Ball " + number + " with " + color + " color".toString();
    }
}
