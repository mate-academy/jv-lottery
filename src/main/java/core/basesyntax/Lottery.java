package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int BAUNDARY_VALUE = 100;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(BAUNDARY_VALUE));
        return ball;
    }
}
