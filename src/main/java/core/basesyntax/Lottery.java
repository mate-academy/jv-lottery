package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();

    public Lottery() {
    }

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
