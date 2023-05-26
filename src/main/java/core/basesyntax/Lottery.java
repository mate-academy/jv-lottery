package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBERS_LIMIT = 100;
    protected Random random = new Random();
    protected ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(NUMBERS_LIMIT));
    }
}
