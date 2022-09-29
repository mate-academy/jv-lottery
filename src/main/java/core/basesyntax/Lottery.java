package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Random getRandom() {
        return random;
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public Ball getRandomBall() {
        return new Ball(getColorSupplier().getRandomColor(), getRandom().nextInt(100));
    }
}
