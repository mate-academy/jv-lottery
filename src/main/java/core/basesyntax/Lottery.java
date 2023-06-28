package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_MAX = 100;
    Random random = new Random();
    ColorSupplier supplier = new ColorSupplier();
    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), random.nextInt(RANDOM_MAX));
    }
}
