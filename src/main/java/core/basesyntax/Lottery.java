package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_COUNT = 101;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(new ColorSupplier().getRandomColor());
        ball.setNumber(new Random().nextInt(BALL_COUNT));
        return ball;
    }
}
