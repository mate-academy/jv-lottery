package core.basesyntax;

import java.awt.*;
import java.util.Random;

public class Ball {
    private String color;
    private int number;

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
        return "Color: " + color + ", number: " + number;
    }

    public Ball() {
        setColor(new ColorSupplier().getRandomColor());
        setNumber(new Random().nextInt(100));
    }
}
