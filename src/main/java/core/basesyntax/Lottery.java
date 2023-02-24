package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int TopBoundNumber = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(TopBoundNumber));
        return ball;
    }
}
