package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private final int maxBallValue = 100;
    private int ballNumber;
    private String randomColor;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ballNumber = random.nextInt(maxBallValue);
        randomColor = new ColorSupplier().getRandomColor();
        ball.setNumber(ballNumber);
        ball.setColor(randomColor);
        return ball;
    }
}
