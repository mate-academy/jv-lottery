package core.basesyntax;

public class Ball {
    private static final int NUMBER_OF_BALLS = 3;
    private String color;
    private int number;

    Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public static int getNumberOfBalls() {
        return NUMBER_OF_BALLS;
    }

    public String toString() {
        return String.valueOf(number) + " " + color;
    }
}
