package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER_RANDOM = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(random.nextInt(MAX_BALL_NUMBER_RANDOM),
                        colorSupplier.getRandomColor());
    }
}
