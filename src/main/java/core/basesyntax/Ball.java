package core.basesyntax;

import java.util.Random;

public class Ball {
    String color;
    int number;
    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }
    @Override
    public String toString() {
        return "Ball number " + number + " and color is " + color;
    }
}
