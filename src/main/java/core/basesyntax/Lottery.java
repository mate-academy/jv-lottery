package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int BALL_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(BALL_NUMBER));
        return ball;
    }
}
