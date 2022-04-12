package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        final int MaxRandomNumber = 101;
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor().toString());
        ball.setNumber(random.nextInt(MaxRandomNumber));
        return ball;
    }
}
