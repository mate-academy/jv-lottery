package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE = 99;

    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(MAX_VALUE) + 1);
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
