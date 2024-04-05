package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final ColorSupplier randomColor = new ColorSupplier();
    private static final Random random = new Random();
    private static final int MAX_VALUE = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(randomColor.getRandomColor());
        ball.setNumber(random.nextInt(MAX_VALUE));

        return ball;
    }
}
