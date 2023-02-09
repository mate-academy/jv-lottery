package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM = 100;
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(random.nextInt(MAX_RANDOM), supplier.getRandomColor());
    }

}
