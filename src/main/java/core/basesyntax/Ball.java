package core.basesyntax;

public class Ball {
    private final String color;
    private final int number;

    public Ball(Colors color, int number) {
        this.color = String.valueOf(color);
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return "Ball number is " + getNumber() + ", color of this ball is " + getColor();
    }
}
