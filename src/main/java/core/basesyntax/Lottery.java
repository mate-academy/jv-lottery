package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int LOTTERY_MAX_COUNT = 100;
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor().name(), random.nextInt(LOTTERY_MAX_COUNT));
    }
}
