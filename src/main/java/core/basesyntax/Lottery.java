package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();
    private final int bound = 101;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(supplier.getRandomColor().toString());
        ball.setNumber(random.nextInt(bound));
        return ball;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public ColorSupplier getSupplier() {
        return supplier;
    }

    public void setSupplier(ColorSupplier supplier) {
        this.supplier = supplier;
    }

    public int getBound() {
        return bound;
    }
}
