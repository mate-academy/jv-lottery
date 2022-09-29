package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random;
    private final ColorSupplier colorSupplier;

    public Lottery(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        final String randomColor = colorSupplier.getRandomColor();
        final int randomNumber = random.nextInt(100);
        return new Ball(randomColor, randomNumber);
    }
}
