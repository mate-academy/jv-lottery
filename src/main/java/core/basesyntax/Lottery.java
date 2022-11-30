package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int ballCount = 100;

    private Random random = new Random();
    private Ball ball = new Ball();
    private ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        ball.setColor(color.getRandomColor());
        ball.setNumber(random.nextInt(ballCount));
        return ball;
    }
}
