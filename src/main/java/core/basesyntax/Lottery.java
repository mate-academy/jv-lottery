package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Lottery(Random random, ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
        this.random = random;
    }

    public Ball getRandomBall() {
        final int value = random.nextInt(100);
        return new Ball(colorSupplier.getRandomColor(), value);
    }
}
