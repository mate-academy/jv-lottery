package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;
    private final int ballCount = 100;

    public Ball() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        color = colorSupplier.getRandomColor();
        number = random.nextInt(ballCount);
    }

    @Override
    public String toString() {
        return " Ball Color " + color + " and number " + number;
    }
}
