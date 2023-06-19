package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Ball ball = new Ball();
    private final int bound = 100;

    public Ball getRandomBall() {
        ball.setColor(colorSupplier.getRandomColor().toString());
        ball.setNumber(random.nextInt(bound));
        return ball;
    }
}
