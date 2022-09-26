package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_VALUE = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(MAX_VALUE + 1));
        return ball;
    }
}
