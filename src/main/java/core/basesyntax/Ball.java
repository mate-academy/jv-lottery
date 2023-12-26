package core.basesyntax;

import java.util.Random;

public class Ball {
    protected String color;
    protected int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball color = " + color + ", " + "ball number = " + String.valueOf(number);
    }
}
