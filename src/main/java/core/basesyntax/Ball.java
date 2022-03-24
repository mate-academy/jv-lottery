package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;
    ColorSupplier supplier = new ColorSupplier();

    public Ball() {
        this.color = supplier.getRandomColor();
        this.number = getRandomNumber();
    }

    private int getRandomNumber() {
        return new Random().nextInt((100 - 1) + 1);
    }

    @Override
    public String toString() {
        return color + " " + number;
    }
}
