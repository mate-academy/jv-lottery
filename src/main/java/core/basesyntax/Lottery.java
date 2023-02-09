package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 101;
    private final Random randomBallNumber = new Random();
    private final ColorSupplier randomBallColor = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(randomBallColor.getRandomColor(),
                randomBallNumber.nextInt(MAX_BALL_NUMBER));
    }
}
