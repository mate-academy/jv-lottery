package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumberOfBall = random.nextInt(MAX_BALL_NUMBER);
        Color randomColor = colorSupplier.getRandomColor();
        Ball ball = new Ball(randomColor, randomNumberOfBall);
        return ball;
    }

}
