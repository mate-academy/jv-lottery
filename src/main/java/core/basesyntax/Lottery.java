package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_BALL = 100;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public Lottery(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        return new Ball(random.nextInt(MAX_BALL), colorSupplier.getRandomColor());
    }
}
