package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;

    public Ball() {
        setNumber(new Random().nextInt(100));
        setColor(new ColorSupplier().getRandomColor());
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
        return "Color: " + color + ", number: " + number;
    }

}
