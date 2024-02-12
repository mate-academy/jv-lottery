package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int RANDOM = 101;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(random.nextInt(RANDOM), colorSupplier.getRandomColor());
    }
}
