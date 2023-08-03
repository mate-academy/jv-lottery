package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int MAX_RANDOM_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String color = colorSupplier.getRandomColor();

    public int getMAX_RANDOM_NUMBER() {
        return MAX_RANDOM_NUMBER;
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    private int number = new Random().nextInt(MAX_RANDOM_NUMBER) + 1;

    public Ball getRandomBall() {
        return new Ball(color, number);
    }
}
