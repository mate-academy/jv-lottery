package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int maxRandom = 100;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(maxRandom));
    }
}
