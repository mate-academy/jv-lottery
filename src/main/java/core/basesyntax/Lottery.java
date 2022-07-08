package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static Random random = new Random();
    private static final int MAX_RANDOM_NUMBER = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_NUMBER));
    }
}
