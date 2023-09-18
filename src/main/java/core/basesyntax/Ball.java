package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;
    private Random random = new Random();

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "This is random color: " + color + "\n"
               + "This is randoom number: " + number;
    }
}
