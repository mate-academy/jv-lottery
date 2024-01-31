package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier;
    private Random random;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
    }

    public Ball getRandomBall() {
        final int randomNumber = random.nextInt(101);
        Ball ball = new Ball(colorSupplier.getRandomColor(), randomNumber);

        return ball;
    }
}
