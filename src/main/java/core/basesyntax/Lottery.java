package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBERS_LIMIT = 100;
    private final ColorSupplier colorBall = new ColorSupplier();
    private final Random numberBall = new Random();

    public Ball getRandomBall() {
        return new Ball(colorBall.getRandomColor(), numberBall.nextInt(NUMBERS_LIMIT));
    }
}
