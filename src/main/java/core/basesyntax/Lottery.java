package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int UPPER_BOUND = 100;
    private static final Random RANDOM = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int random = RANDOM.nextInt(UPPER_BOUND);
        return new Ball(colorSupplier.getRandomColor(), random);
    }
}
