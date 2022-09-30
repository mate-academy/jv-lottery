package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random;
    private final ColorSupplier supplier;

    public Lottery(Random random, ColorSupplier supplier) {
        this.random = random;
        this.supplier = supplier;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        int numberOfBalls = 100;
        int number = this.random.nextInt(numberOfBalls);
        ball.setNumber(number);
        ball.setColor(supplier.getRandomColor());
        return ball;
    }
}
