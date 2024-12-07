package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final Ball ball = new Ball();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(101));
        return ball;
    }
}
