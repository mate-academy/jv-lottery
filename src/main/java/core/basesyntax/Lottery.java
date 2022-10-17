package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random;
    private final ColorSupplier colorSupplier;

    public Lottery() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        final int MAX = 100;
        return new Ball(random.nextInt(MAX), colorSupplier.getRandomColor());
    }
}
