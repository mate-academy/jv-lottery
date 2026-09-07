package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private final Random random = new Random();

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        int number = random.nextInt(MAX_BALL_NUMBER);
        Ball ball = new Ball(randomColor, number);

        return ball;
    }
}

