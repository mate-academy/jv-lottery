package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int ballNumber = random.nextInt(100); // Generate Random Number for ball
        Ball ball = new Ball(ballNumber, colorSupplier.getRandomColor());
        return ball;
    }
}
