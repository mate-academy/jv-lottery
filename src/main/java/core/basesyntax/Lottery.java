package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_BOUND = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball newBall = new Ball(random.nextInt(NUMBER_BOUND),
                colorSupplier.getRandomColor());
        return newBall;
    }
}
