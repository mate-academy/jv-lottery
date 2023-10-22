package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_LIMIT = 100;
    private ColorSupplier randomColor = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(randomColor.getRandomColor());
        ball.setNumber(random.nextInt(RANDOM_LIMIT));
        return ball;
    }
}
