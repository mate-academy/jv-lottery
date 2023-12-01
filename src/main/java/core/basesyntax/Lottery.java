package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public final Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(supplier.getRandomColor().name());
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
