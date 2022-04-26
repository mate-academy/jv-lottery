package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static ColorSupplier supplier = new ColorSupplier();
    private static Random random = new Random();
    private final int MAX_BOUND = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(supplier.getRandomColor());
        ball.setNumber(random.nextInt(MAX_BOUND));
        return ball;
    }
}
