package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_RANG = 100;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public Lottery(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        final String randomColor = colorSupplier.getRandomColor();
        final int randomNumber = random.nextInt(NUMBER_RANG);
        return new Ball(randomColor, randomNumber);
    }
}
