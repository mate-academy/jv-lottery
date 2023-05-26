package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_BALL_NUMBER = 100;
    private final Random randomSupplier = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomBallNumber = randomSupplier.nextInt(MAX_BALL_NUMBER + 1);

        return new Ball(randomColor, randomBallNumber);
    }
}
