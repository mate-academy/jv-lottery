package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int UPPER_BOUND = 100;

    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();
        return new Ball(supplier.getRandomColor(), random.nextInt(UPPER_BOUND));
    }
}
