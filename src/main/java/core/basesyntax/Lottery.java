package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private static final int MAX_BALLS = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        String color = colorSupplier.getRandomColor();
        ball.setColor(color);
        ball.setNumber(random.nextInt(MAX_BALLS));
        return ball;
    }
}
