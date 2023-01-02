package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final ColorSupplier supplier;
    private final Random random;


    public Lottery(ColorSupplier supplier, Random random) {
        this.supplier = supplier;
        this.random = random;
    }

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), random.nextInt(MAX_NUMBER));
    }
}
