package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int TOP_BOUND_NUMBER = 100;
    Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(TOP_BOUND_NUMBER));
        return ball;
    }
}