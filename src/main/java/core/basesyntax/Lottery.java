package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_BOUND = 101;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random randomNumberSupplier = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(),
                randomNumberSupplier.nextInt(MAX_RANDOM_BOUND));

    }
}
