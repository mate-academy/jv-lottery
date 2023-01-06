package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier ballColor = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(ballColor.getRandomColor());
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
