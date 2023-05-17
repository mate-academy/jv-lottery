package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int BALL_NUMBERS_BOUND = 101;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(BALL_NUMBERS_BOUND));
    }
}
