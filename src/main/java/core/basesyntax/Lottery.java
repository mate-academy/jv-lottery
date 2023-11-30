package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Ball ball = new Ball();
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
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

    public Ball getRandomBall() {
        ball.setBallColor(supplier.getRandomColor().name());
        ball.setBallNumber(random.nextInt(100));
        return ball;
    }
}
