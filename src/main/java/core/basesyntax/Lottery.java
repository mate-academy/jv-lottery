package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;
    private ColorSupplier supplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(random.nextInt(BOUND), supplier.getRandomColor());
    }
}
