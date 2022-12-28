package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor().name());
        int bound = 100;
        ball.setNumber(random.nextInt(bound));
        return ball;
    }
}
