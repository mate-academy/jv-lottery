package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private static final int BOUND = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(),random.nextInt(BOUND));
    }
}
