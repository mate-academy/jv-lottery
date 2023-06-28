package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private final Random randomBallNumber = new Random();
    private final ColorSupplier colorSupply = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(
                String.valueOf(colorSupply.getRandomColor()),
                randomBallNumber.nextInt(MAX_BALL_NUMBER)
        );
    }
}
