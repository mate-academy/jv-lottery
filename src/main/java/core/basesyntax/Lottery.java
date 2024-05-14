package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random number = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final int lowerBound = 1;
    private final int upperBound = 101;

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(),
                number.nextInt(upperBound - lowerBound) + lowerBound);
    }
}
