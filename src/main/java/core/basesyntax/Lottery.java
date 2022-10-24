package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_COUNT = 100;
    private Ball ball = new Ball();
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomBall = random.nextInt(BALL_COUNT);
        ball.setNumber(randomBall);
        String randomColor = colorSupplier.getRandomColor();
        ball.setColour(randomColor);
        return ball;
    }
}
