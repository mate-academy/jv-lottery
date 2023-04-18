package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_BOUND = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(NUMBER_BOUND));
    }
}
