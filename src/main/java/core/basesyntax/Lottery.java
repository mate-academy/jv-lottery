package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();
    private Ball ball = new Ball();

    public Random getRandom() {
        return random;
    }

    public ColorSupplier getSupplier() {
        return supplier;
    }

    public Ball getBall() {
        return ball;
    }

    public Ball getRandomBall() {
        ball.setColor(String.valueOf(supplier.getRandomColor()));
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}


