package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_COUNT = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(NUMBER_COUNT));
    }
}
