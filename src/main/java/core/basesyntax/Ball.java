package core.basesyntax;

import java.util.Random;

public class Ball {
    private int number;
    private String color;

    public Ball() {
        color = new ColorSupplier().getRandomColor();
        number = new Random().nextInt(99) + 1;
    }

    @Override
    public String toString() {
        return "Ball with " + "color=" + color + ", number=" + number;
    }
}
