package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRandomNumber() {
        int ballNumber = new Random().nextInt(100);
        return ballNumber;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
