package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public Lottery(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(MAX_RANDOM_NUMBER);
        return new Ball(number, color);
    }
}
