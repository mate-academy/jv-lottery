package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        final int limit = 100;
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColor(colorSupplier.getRandomColor());
        Random random = new Random();
        ball.setNumber(random.nextInt(limit));
        return ball;
    }
}
