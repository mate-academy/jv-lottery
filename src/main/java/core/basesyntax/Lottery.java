package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(ColorSupplier.getRandomColor(), random.nextInt(100));
    }
}
