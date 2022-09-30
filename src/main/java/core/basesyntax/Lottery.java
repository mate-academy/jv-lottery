package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random;
    private final ColorSupplier supplier;
    static final int NUMBER_OF_BALLS = 100;

    public Lottery(Random random, ColorSupplier supplier) {
        this.random = random;
        this.supplier = supplier;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        int number = this.random.nextInt(NUMBER_OF_BALLS);
        ball.setNumber(number);
        ball.setColor(supplier.getRandomColor());
        return ball;
    }
}
