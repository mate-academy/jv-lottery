package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static Random random = new Random();
    private final int ballNumber = 100;

    public Ball getRandomBall() {
        return new Ball(ColorSupplier.getRandomColor(), random.nextInt(ballNumber));
    }
}
