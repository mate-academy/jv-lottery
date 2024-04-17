package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();
    private static final int BOUND = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(color.getRandomColor());
        ball.setNumber(random.nextInt(BOUND + 1));
        return ball;
    }
}
