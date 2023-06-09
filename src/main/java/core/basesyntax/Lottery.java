package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random1 = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall(Ball ball) {
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random1.nextInt(100));
        return ball;
    }
}
