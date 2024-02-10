package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MIN_BALL_NUMBER = 1;
    private static final int MAX_BALL_NUMBER = 100;
    ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();
    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(),
                random.nextInt(MIN_BALL_NUMBER, MAX_BALL_NUMBER + 1));
    }
}
