package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUMBER_LIMIT = 101;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomInt = random.nextInt(BALL_NUMBER_LIMIT);
        return new Ball(colorSupplier.getRandomColor(), randomInt);

    }
}
