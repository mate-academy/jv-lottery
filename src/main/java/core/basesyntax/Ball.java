package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;

    Ball(String color) {
        this.color = color;
        this.number = new Random().nextInt(101);
    }

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
        return color + " ball with number" + "(" + number + ")";
    }
}
