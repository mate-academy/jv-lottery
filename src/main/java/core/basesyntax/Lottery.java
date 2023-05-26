package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_BALL = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(random.nextInt(NUMBER_BALL), colorSupplier.getRandomColor());
    }
}
