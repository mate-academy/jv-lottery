package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int BOUND = 100;
    private Random random;
    private ColorSupplier colorSupplier;

    public Ball getRandomBall() {
        return new Ball(random.nextInt(BOUND), colorSupplier.getRandomColor());
    }
}
