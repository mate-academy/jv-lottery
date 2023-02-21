package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_COUNT = 100;
    private final Random random = new Random();
    private final  ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();

        ball.setNumber(random.nextInt(NUMBER_COUNT));
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
