package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int BOUND = 100;
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), random.nextInt(BOUND));
    }
}
