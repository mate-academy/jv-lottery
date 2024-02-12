package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static ColorSupplier colorSupplier = new ColorSupplier();

    private static Random random = new Random();
    private static final byte MAX_POSSIBLE_BALL_NUMBER = 100;

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(),
                random.nextInt(MAX_POSSIBLE_BALL_NUMBER));
    }
}
