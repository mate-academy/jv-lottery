package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private Integer number;

    public Ball(String color, Integer number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return color + " color " + "and number - " + number.toString() + " on it";
    }
}
