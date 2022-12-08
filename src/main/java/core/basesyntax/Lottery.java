package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier supplier = new ColorSupplier();
    Random random = new Random();
    private static final int bound = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(bound));
        ball.setColor(supplier.getRandomColor().name());
        return ball;
    }
}
