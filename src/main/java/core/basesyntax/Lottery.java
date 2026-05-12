package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.color = supplier.getRandomColor();
        ball.number = random.nextInt(100);
        return ball;
    }
}
