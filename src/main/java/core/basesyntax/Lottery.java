package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    private static final int RANDOM_INTEGER = 100;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public Lottery(ColorSupplier colorSupplier, Random random) {
        this.colorSupplier = colorSupplier;
        this.random = random;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(RANDOM_INTEGER));
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
