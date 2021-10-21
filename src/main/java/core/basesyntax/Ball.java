package core.basesyntax;

public class Ball {
    static final int NUMBER_OF_BALLS = 3;
    private String color;
    private int number;

    Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public String toString() {
        return String.valueOf(number) + " " + color;
    }
}
