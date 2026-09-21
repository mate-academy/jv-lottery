package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXIMUM_NUMBER = 100;

    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();

        ColorSupplier randomColor = new ColorSupplier();
        ball.setNumber(random.nextInt(MAXIMUM_NUMBER));
        ball.setColor(randomColor.getRandomColor());
        return ball;
    }
}
