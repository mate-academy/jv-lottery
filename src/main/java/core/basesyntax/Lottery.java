package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANGE_BOUND = 100;
    private ColorSupplier colorSupplier;
    private Random random = new Random();

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(RANGE_BOUND));
        return ball;
    }
}
