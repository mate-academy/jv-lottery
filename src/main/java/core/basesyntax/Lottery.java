package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int LIMIT = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColor(colorSupplier.getRandomColor());
        Random random = new Random();
        ball.setNumber(random.nextInt(LIMIT));
        return ball;
    }
}
