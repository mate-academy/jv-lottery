package core.basesyntax;

import java.util.Random;

class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private final int maxRandomValue = 100;

    protected Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(maxRandomValue));
    }
}

