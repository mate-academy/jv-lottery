package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_BALLS = 100;

    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        int number = new Random().nextInt(MAX_RANDOM_BALLS);

        return new Ball(supplier.getRandomColor(), number);
    }
}
