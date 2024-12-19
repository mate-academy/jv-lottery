package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public Lottery(ColorSupplier colorSupplier, Random random) {
        this.colorSupplier = colorSupplier;
        this.random = random;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(MAX_NUMBER));
        return ball;
    }
}
