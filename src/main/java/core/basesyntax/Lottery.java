package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUMBER_MAX = 100;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public Lottery(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(BALL_NUMBER_MAX));
        return ball;
    }
}
