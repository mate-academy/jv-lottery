package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private Ball ball = new Ball();
    private ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        final int ballCount = 100;
        ball.setColor(color.getRandomColor());
        ball.setNumber(random.nextInt(ballCount));
        return ball;
    }
}
