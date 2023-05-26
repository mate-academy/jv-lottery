package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND_NUMBER = 100;

    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(BOUND_NUMBER));
        return ball;
    }
}
