package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private static final int count = 100;

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(count));
    }
}
