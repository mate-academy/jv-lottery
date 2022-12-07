package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final Random random = new Random();

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(random.nextInt(100) + 1, colorSupplier.getRandomColor());
    }
}
