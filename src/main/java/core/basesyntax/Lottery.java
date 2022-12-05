package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_RANDOM_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_NUMBER));
    }
}
