package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random rand = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(rand.nextInt(101));
        return ball;
    }
}
