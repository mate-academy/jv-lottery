package core.basesyntax;

import java.util.Random;

public class Loterry {
    private static final int ORIGIN = 1;
    private static final int BOUND = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(ORIGIN, BOUND));
    }
}
