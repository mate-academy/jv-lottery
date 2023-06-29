package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private final Random randomNumberGenerator = new Random();

    public Ball getRandomBall() {
        int randomNumber = randomNumberGenerator.nextInt(MAX_BALL_NUMBER);
        return new Ball(randomNumber);
    }
}
