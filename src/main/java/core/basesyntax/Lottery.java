package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int NUMBER_LIMIT = 101;

    private Random random;
    private ColorSupplier colorSupplier;

    public Lottery() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(NUMBER_LIMIT));
    }
}
