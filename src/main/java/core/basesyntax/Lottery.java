package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        int value = random.nextInt(100);

        return new Ball(supplier.getRandomColor().toString(), value);
    }
}
