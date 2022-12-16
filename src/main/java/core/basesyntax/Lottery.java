package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private final int NUMBER_LIMIT = 100;

    public Ball getRandomBall() {

        Ball ball = new Ball();

        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(NUMBER_LIMIT));

        return ball;
    }
}
