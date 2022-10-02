package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_RANGE = 100;
    ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(NUMBER_RANGE));
        return ball;
    }
}
