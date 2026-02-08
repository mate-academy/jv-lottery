package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        int maxNumber = 100;
        return new Ball(supplier.getRandomColor(), random.nextInt(maxNumber) + 1);
    }
}
