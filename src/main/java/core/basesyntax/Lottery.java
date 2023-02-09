package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final int bound = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomBallNumber = random.nextInt(bound);
        return new Ball(colorSupplier.getRandomColor(),randomBallNumber);
    }
}
