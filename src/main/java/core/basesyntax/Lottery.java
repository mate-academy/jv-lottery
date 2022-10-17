package core.basesyntax;

import java.util.Random;

public class Lottery {
    final int BOUND = 100;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public Lottery() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        return new Ball(random.nextInt(BOUND), colorSupplier.getRandomColor());
    }
}
