package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), new Random().nextInt(NUMBER));
    }
}
