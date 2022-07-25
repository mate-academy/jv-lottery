package core.basesyntax;

import java.util.Random;

public class Ball {
    private final String color;
    private final int number;

    public Ball(int number, String color) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }
}
