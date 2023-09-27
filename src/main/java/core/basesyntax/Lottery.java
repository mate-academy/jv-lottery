package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;

    public Ball getRandomBall() {
        Random random = new Random();
        Ball ball = new Ball();
        ColorSupplier randomColor = new ColorSupplier();
        ball.setNumber(random.nextInt(MAX_BALL_NUMBER));
        ball.setColor(randomColor.getRandomColor());
        return ball;
    }
}
