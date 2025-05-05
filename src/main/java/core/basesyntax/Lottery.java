package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 101;
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(supplier.getRandomColor().name());
        ball.setNumber(random.nextInt(BOUND));
        return ball;
    }
}
