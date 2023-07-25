package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random;
    private final ColorSupplier colorSupplier;

    public Lottery(final Random random, final ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        return new Ball(random.nextInt(100), colorSupplier.getRandomColor());
    }

    public Random getRandom() {
        return random;
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }
}
