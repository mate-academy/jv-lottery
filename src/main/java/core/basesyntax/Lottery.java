package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int LIMIT = 100;
    private Random random;
    private ColorSupplier colorSupplier;

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(LIMIT));
    }
}
