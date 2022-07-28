package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int value = new Random().nextInt(BOUND);
        return new Ball(colorSupplier.getRandomColor(), value);

    }
}
