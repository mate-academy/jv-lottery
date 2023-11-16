package core.basesyntax;

public class Ball {
    private static final int MAX_NUMBER = 100;
    private String color;
    private int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public static int getMaxNumber() {
        return MAX_NUMBER;
    }

    @Override
    public String toString() {
        return "{Color: " + color + ", number: " + number + "}";
    }
}
