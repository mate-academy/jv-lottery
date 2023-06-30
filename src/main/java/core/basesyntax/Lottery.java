package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private String randomColor = new ColorSupplier().getRandomColor();
    private int randomNumber = new Random().nextInt(MAX_BALL_NUMBER);

    public Ball getRandomBall() {
        final int maxBallNumber = 100;
        String randomColor = new ColorSupplier().getRandomColor();
        int randomNumber = new Random().nextInt(maxBallNumber);
        Ball ball = new Ball();
        ball.setColor(randomColor);
        ball.setNumber(randomNumber);
        return ball;
    }
}
