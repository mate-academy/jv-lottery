package core.basesyntax;

public class Ball {
    private int number;
    private Colors color;

    @Override
    public String toString() {
        return "Color: " + color + " Number: " + number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }
}
