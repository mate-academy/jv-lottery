package core.basesyntax;

public class Ball {
    static final int MAX_NUMBER = 100;
    private final String color;
    private final int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball: color " + color + ", number " + number;
    }
}
