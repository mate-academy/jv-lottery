package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int LIMIT_100 = 100;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor().getColorName(), random.nextInt(LIMIT_100));
    }
}
