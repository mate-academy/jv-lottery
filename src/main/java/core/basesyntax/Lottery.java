package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_COUNT = 101;
    private Random random = new Random();
    private Ball ball = new Ball();
    private ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        ball.setNumber(random.nextInt(NUMBER_COUNT));
        ball.setColor(color.getRandomColor());
        return ball;
    }
}
