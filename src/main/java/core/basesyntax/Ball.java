package core.basesyntax;

import java.util.Random;

public class Ball {
    int number;
    String color;
    public Ball(int number, String color) {
        this.number = number;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Ball {" +
                "number=" + number +
                ", color='" + color + '\'' +
                '}';
    }
}
