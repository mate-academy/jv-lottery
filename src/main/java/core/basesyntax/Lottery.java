package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 101;
    private Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(MAX_BALL_NUMBER));
        ball.setColor(randomColor.getRandomColor());
        return ball;
    }
}
