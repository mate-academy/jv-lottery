package core.basesyntax;

import java.util.Random;

public class Ball {
    int number;
    String color;

    public Ball(Random number, String randomColor) {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String colour) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
