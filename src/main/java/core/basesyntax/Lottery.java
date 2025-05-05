package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAXIMUM_POSSIBLE_NUMBER = 100;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public Lottery(final Random random, final ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        return new Ball(random.nextInt(MAXIMUM_POSSIBLE_NUMBER), colorSupplier.getRandomColor());
    }
}
