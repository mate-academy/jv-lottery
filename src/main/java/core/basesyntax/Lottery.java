package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private static final int RANDOM_LIMIT = 100;

    public Ball getRandomBall() {

        Ball ball = new Ball();

        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(number));

        return ball;
    }
}
