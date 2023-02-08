package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_COUNT = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), new Random().nextInt(RANDOM_COUNT));
    }
}
