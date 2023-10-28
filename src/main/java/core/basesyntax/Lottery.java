package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();

    private Random random = new Random();

    public final int MAX_RANDOM_NUMBER = 100;

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_NUMBER));
    }
}
