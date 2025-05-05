package core.basesyntax;

import java.util.Random;

public class Ball {
    protected String color;
    protected int number;

    public Ball(String color, int number) {
        this.number = number;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Ball { color: '" + color + "', number: " + number + " }";

    }
}
