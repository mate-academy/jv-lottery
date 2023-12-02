package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier supplier = new ColorSupplier();
    private Random random = new Random();
    private static final int MAGIC_NUM = 100;

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), random.nextInt(MAGIC_NUM));
    }
}
