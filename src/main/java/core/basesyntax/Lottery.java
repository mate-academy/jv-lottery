package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUMBER = 101;
    private Random random;
    private ColorSupplier colorSupplier;

    public Lottery() {
        this.random = new Random();
        this.colorSupplier = new ColorSupplier(this.random);
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(this.BALL_NUMBER));
    }
}
