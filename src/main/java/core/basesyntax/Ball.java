package core.basesyntax;

public class Ball {
    private final String color;
    private final int number;

    @Override
    public String toString() {
        return "Ball color is " + this.color + ", Ball number is " + this.number;
    }

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }
}
