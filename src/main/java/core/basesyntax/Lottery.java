package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER_ON_BALL = 100;
    private final Random random = new Random();
    private final ColorSupplier colors = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(MAX_NUMBER_ON_BALL));
        ball.setColor(colors.getRandomColor());
        return ball;
    }
}
