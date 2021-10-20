package core.basesyntax;

import core.basesyntax.models.Ball;
import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        byte randomBallNumber = (byte) random.nextInt(100);
        return new Ball(colorSupplier.getRandomColor(), randomBallNumber);
    }
}
