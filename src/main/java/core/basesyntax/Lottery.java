package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANGE = 100;
    private final ColorSupplier supplier = new ColorSupplier();

    private final Random random = new Random();

    public Ball getRandomBall() {
        Color randomIndex = supplier.getRandomIndex();
        Ball ball = new Ball(randomIndex.name(), random.nextInt(RANGE));
        return ball;
    }
}
