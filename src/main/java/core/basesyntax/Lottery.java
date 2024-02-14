package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int RANDOM_NUMBER_VERGE = 101;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(RANDOM_NUMBER_VERGE));
    }
}
