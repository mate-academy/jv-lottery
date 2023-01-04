package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private int boundNumber = 100;

    public Random getRandom() {
        return random;
    }

    public Ball getRandomBall() {
        int number = getRandom().nextInt(boundNumber);
        String color = colorSupplier.getRandomColor();

        return new Ball(color, number);
    }
}
