package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int LOTTERY_MAX_COUNT = 100;
    private final Random random = new Random();

    public Ball getRandomBall() {
        int index = random.nextInt(LOTTERY_MAX_COUNT);
        return new Ball(new ColorSupplier().getRandomColor(), index);
    }
}
