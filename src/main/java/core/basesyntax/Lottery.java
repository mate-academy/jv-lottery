package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANGE_BOUND = 100;
    private ColorSupplier colorSupplier;
    private Ball ball = new Ball();
    private Random random = new Random();

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(RANGE_BOUND));
        return ball;
    }
}
