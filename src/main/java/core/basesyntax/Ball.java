package core.basesyntax;

public class Ball {
    private Colors color;
    private int number;

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
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
        return "Appear the ball with " + color + " color and number " + number;
    }
}
