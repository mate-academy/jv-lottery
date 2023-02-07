package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;

    private final Random random = new Random();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball number: " + number + ", color " + color;
    }
}
