package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier;
    private final int maxRandomValue = 100;

    public Lottery(Random random, ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall(Random random) {
        return new Ball(colorSupplier.getRandomColor(random), random.nextInt(maxRandomValue));
    }
}
